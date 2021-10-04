package com.jeramtough.jtweb.component.filesaver.excel;

import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.jeramtough.jtweb.component.filesaver.base.BaseFileSaver;
import com.jeramtough.jtweb.component.filesaver.config.FileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.config.excel.ExcelFileSaveConfigAdapter;
import com.jeramtough.jtweb.component.filesaver.exception.IllegalFileTypeException;
import com.jeramtough.jtweb.component.filesaver.exception.MaxSizeLimitException;
import com.jeramtough.jtweb.component.filesaver.exception.SaveFileException;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * <pre>
 * Created on 2021/10/2 下午11:25
 * by @author WeiBoWen
 * </pre>
 */
public class ExcelFileSaver extends BaseFileSaver<List<Map<String, Object>>> {

    private final ExcelFileSaveConfigAdapter excelFileSaveConfigAdapter;

    public ExcelFileSaver(
            ExcelFileSaveConfigAdapter excelFileSaveConfigAdapter) {
        super(excelFileSaveConfigAdapter);
        this.excelFileSaveConfigAdapter = excelFileSaveConfigAdapter;
    }

    @Override
    public File save(List<Map<String, Object>> dataList) throws IOException, SaveFileException,
            MaxSizeLimitException, IllegalFileTypeException {
        final Map<String, String> keyMap = excelFileSaveConfigAdapter.getKeyMap();


        List<Map<String, Object>> newDataList = dataList
                .parallelStream()
                .map(dataMap -> {
                    Map<String, Object> newData = new LinkedHashMap<>(keyMap.size());
                    keyMap.keySet()
                          .forEach(key -> {
                              String keyMapStr = keyMap.get(key);
                              Object value = dataMap.get(key);
                              if (!StringUtils.hasText(
                                      value == null ? "" : value.toString())) {
                                  newData.put(keyMapStr,
                                          excelFileSaveConfigAdapter.getEmptyValue());
                              }
                              else {
                                  newData.put(keyMapStr, value);
                              }
                          });
                    return newData;
                })
                .collect(Collectors.toList());

        File file = new File(excelFileSaveConfigAdapter.getPath()
                + File.separator + excelFileSaveConfigAdapter.getFileName());
        if (!file.getAbsolutePath().endsWith(".xlsx")) {
            file = new File(file.getAbsolutePath() + ".xlsx");
        }

        if (file.exists()) {
            file.delete();
        }

        ExcelWriter writer = ExcelUtil.getWriter(file);

        // 合并单元格后的标题行，使用默认标题样式
        boolean hasTitle = StringUtils.hasText(excelFileSaveConfigAdapter.getTitle());
        if (hasTitle) {
            writer.merge(excelFileSaveConfigAdapter.getKeyMap().size() - 1,
                    excelFileSaveConfigAdapter.getTitle());
        }

        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(newDataList, true);
        // 关闭writer，释放内存
        writer.close();

        getLogger().debug("成功转换数据为excel文件【%s】", file.getAbsoluteFile());

        return file;
    }
}
