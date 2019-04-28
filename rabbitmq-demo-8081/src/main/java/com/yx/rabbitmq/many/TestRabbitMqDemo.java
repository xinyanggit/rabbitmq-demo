package com.yx.rabbitmq.many;

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
    private RabbitSend1 rabbitsend;
    @Autowired
    private RabbitSend2 rabbitsend2;

    @Test
    public void oneToMany() throws Exception {
        for (int i = 0; i <100 ; i++) {
            rabbitsend.send(i);
        }

        /**
         *  一个发送者，N个接受者,经过测试会均匀的将消息发送到N个接收者中
         */
    }

    @Test
    public void ManyToMany() throws Exception {
        for (int i = 0; i <100 ; i++) {
            rabbitsend.send(i);
            rabbitsend2.send(i);
        }

        /**
         *  2个发送者，2个接受者 , 和一对多一样，接收端仍然会均匀接收到消息
         */
    }

}