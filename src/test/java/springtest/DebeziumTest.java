package springtest;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <pre>
 * Created on 2021/8/12 上午8:48
 * by @author WeiBoWen
 * </pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DebeziumTest {
}
