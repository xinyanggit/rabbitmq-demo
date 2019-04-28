package com.yx.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
@RabbitListener(queues = TopicRabbitConfig.irisOne)
public class TopicRabbitReceivce {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("接收方Receiver-->"+TopicRabbitConfig.irisOne+" ->  : " + hello);
    }
}
