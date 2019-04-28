package com.yx.rabbitmq.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
public class RabbitSend2 {

    /**
     * 1.发送者 ，就是生产者
     */

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send( int i ) {
        String context = "helloMany-->num->  " + i ;
        System.out.println("Sender 22 : " + context);
        this.rabbitTemplate.convertAndSend("queueyxMany", context); // routekey ,value
    }
}
