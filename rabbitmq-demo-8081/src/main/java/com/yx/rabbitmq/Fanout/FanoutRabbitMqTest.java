package com.yx.rabbitmq.Fanout;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
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
public class FanoutRabbitMqTest {

    @Autowired
    private FanoutRabbitSend rabbitsend;

    @Test
    public void hello() throws Exception {
        rabbitsend.send();

    }


}