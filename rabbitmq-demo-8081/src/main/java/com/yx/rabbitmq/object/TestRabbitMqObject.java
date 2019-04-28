package com.yx.rabbitmq.object;

import com.yx.rabbitmq.many.RabbitSend1;
import com.yx.rabbitmq.many.RabbitSend2;
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
public class TestRabbitMqObject {

    @Autowired
    private ObjectSender rabbitsend;


    @Test
    public void oneToMany() throws Exception {
        rabbitsend.send();
    }

}