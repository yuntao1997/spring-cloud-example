import com.yuntao.rabbitmq.RabbitMQApplication;
import com.yuntao.rabbitmq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ${DESCRIPTION}
 *
 * @author yuntao.zhou
 * @version 1.0
 * @create 2018-11-13 16:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(RabbitMQApplication.class)
public class RabbitMQApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();


        Thread.sleep(5*1000);

    }
}
