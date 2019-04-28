package com.yx.rabbitmq.object;

import com.yx.rabbitmq.model.Person;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
@RabbitListener(queues = "queueyxObject")
public class ObjectReceivce {

    @RabbitHandler
    public void process(Person person) {
        System.out.println("接收方ObjectReceivce : " + person);
    }
}
