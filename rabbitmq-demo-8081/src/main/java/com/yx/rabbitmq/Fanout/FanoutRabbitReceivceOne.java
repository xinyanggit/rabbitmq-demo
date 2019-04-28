package com.yx.rabbitmq.Fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
@RabbitListener(queues = FanoutRabbitConfig.irisOne)
public class FanoutRabbitReceivceOne {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("接收方Receiver-->"+ FanoutRabbitConfig.irisOne+" ->  : " + hello);
    }
}
