package com.yx.rabbitmq.topic;

import com.yx.rabbitmq.one.RabbitSend;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yx start
 * @create 2019/4/28,0:28
 */

/**
 * 4.测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicRabbitMqTest {

    @Autowired
    private TopicRabbitSend rabbitsend;

    @Test
    public void hello() throws Exception {
        rabbitsend.send();

    }
    @Test
    public void sendAll() throws Exception {
        rabbitsend.sendAll();
    }
}