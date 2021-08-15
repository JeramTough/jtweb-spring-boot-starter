package com.jeramtough.jtweb.component.bebezium.factory;

import com.jeramtough.jtlog.facade.L;
import com.jeramtough.jtweb.component.bebezium.bean.ChangedData;
import com.jeramtough.jtweb.component.bebezium.bean.DbOptionType;
import io.debezium.data.Envelope;
import org.apache.kafka.connect.data.Field;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.source.SourceRecord;

import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * <pre>
 * Created on 2021/8/10 上午10:57
 * by @author WeiBoWen
 * </pre>
 */
public class ChangeDataFactory {

    public static ChangedData getChangedData(SourceRecord sourceRecord) {
        try {

            String idKeyName = null;
            String idKeyValue = null;
            if (sourceRecord.key() != null) {
                Struct keyStruct = ((Struct) sourceRecord.key());
                if (keyStruct.schema().fields().size() > 0) {
                    idKeyName = keyStruct.schema().fields().get(0).name();
                    Object idKeyValueObject = ((Struct) sourceRecord.key()).get(idKeyName);
                    idKeyValue = idKeyValueObject.toString();
                }
            }


            Struct sourceRecordChangeValue = (Struct) sourceRecord.value();
            if (sourceRecordChangeValue != null) {
                ChangedData changedData = new ChangedData();

                if (sourceRecordChangeValue.schema().field("op") == null) {
                    return null;
                }

                Envelope.Operation operation = Envelope.Operation.forCode(
                        (String) sourceRecordChangeValue.get("op"));

                //查询操作不用记录
                if (operation == Envelope.Operation.READ) {
                    return null;
                }

                Struct sourceStruct = (Struct) sourceRecordChangeValue.get("source");
                String tableName = sourceStruct.getString("table");
                String dbName = sourceStruct.getString("db");

                String keyName = operation == Envelope.Operation.DELETE ? "before" : "after";
                Struct struct = (Struct) sourceRecordChangeValue.get(keyName);


                //将拿一行表数据转为map类型
                Map<String, Object> data = struct
                        .schema()
                        .fields()
                        .parallelStream()
                        .map(Field::name)
                        .filter(fieldName -> struct.get(fieldName) != null)
                        .collect(Collectors.toMap(fieldName -> fieldName,
                                struct::get));


                DbOptionType dbOptionType = null;
                switch (operation) {
                    case CREATE:
                        dbOptionType = DbOptionType.INSERT;
                        break;
                    case UPDATE:
                        dbOptionType = DbOptionType.UPDATE;
                        break;
                    case TRUNCATE:
                    case DELETE:
                        dbOptionType = DbOptionType.DELETE;
                        break;
                    default:
                }
                Objects.requireNonNull(dbOptionType);

                changedData.setIdKeyName(idKeyName);
                changedData.setIdKeyValue(idKeyValue);
                changedData.setDbOptionType(dbOptionType);
                changedData.setDbName(dbName);
                changedData.setTableName(tableName);
                changedData.setData(data);
                return changedData;
            }
        }
        catch (Exception e) {
            L.warn(e.getMessage());
            return null;
        }
        return null;
    }

}
