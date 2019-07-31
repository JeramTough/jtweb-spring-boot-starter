package test;

import com.alibaba.fastjson.JSON;
import com.jeramtough.apiresponse.bean.FailureReason;
import com.jeramtough.jtlog.facade.L;
import org.junit.Test;

/**
 * Created on 2019/7/31 15:34
 * by @author WeiBoWen
 */
public class TestMain {

    @Test
    public void test(){
        FailureReason failureReason=new FailureReason();
        failureReason.setCode(444);
        failureReason.setPlaceholders(new String[]{"aaa","bbb","ccc"});
        String a=JSON.toJSONString(failureReason,false);
        L.debug(a);
    }
}
