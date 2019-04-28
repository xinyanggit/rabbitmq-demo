package com.yx.rabbitmq.Fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
public class FanoutRabbitSend {

    /**
     * 1.发送者 ，就是生产者
     */

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 会匹配两个
     */
    public void send() {
        String context = " >> RabbitSend-yx=================^V^" + System.currentTimeMillis();
        System.out.println("Sender : " + context);
//        this.rabbitTemplate.convertAndSend("queueyx", context); // routekey ,value
        rabbitTemplate.convertAndSend(FanoutRabbitConfig.topicExchange, FanoutRabbitConfig.irisOne,context);
//        rabbitTemplate.convertSendAndReceive() ;
    }
}
