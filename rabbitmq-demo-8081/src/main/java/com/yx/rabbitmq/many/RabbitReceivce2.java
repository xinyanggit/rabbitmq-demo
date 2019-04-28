package com.yx.rabbitmq.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
@RabbitListener(queues = "queueyxMany")
public class RabbitReceivce2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("接收方Receiver222 : " + hello);
    }
}
