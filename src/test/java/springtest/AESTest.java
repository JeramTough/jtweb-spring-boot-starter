package springtest;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import com.jeramtough.jtlog.facade.L;
import org.junit.Test;

/**
 * <pre>
 * Created on 2022/3/27 上午2:22
 * by @author WeiBoWen
 * </pre>
 */
public class AESTest {

    @Test
    public void test2() {
        String key="jeramtough123456";
        AES aes = SecureUtil.aes(key.getBytes());
        String base641 = aes.encryptBase64("LTAI5tE1xk4Vht3ZdykzEhi8".getBytes());
        String base642 = aes.encryptBase64("NE2Ky1EB99kcZLzizqzXpO86ixX6Wt".getBytes());
        L.debugs(base641, base642);
        aes = SecureUtil.aes(key.getBytes());
        String b = aes.decryptStr(base641);
        L.debug(new String(b));


    }

}
