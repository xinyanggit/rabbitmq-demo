package com.yx.rabbitmq.one;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
public class RabbitSend {

    /**
     * 1.发送者 ，就是生产者
     */

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello-->yx=================^V^" + System.currentTimeMillis();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("queueyx", context); // routekey ,value
    }
}
