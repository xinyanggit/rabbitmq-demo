package com.yx.rabbitmq.one;

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
public class TestRabbitMqDemo {
    @Autowired
    private RabbitSend rabbitsend;

    @Test
    public void hello() throws Exception {
        rabbitsend.send();
    }
}