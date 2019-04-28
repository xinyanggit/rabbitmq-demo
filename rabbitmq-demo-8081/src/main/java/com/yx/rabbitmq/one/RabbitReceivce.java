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
@RabbitListener(queues = "queueyx")
public class RabbitReceivce {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("接收方Receiver111  : " + hello);
    }
}
