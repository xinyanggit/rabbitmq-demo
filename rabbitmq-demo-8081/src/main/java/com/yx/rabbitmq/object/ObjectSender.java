package com.yx.rabbitmq.object;

import com.yx.rabbitmq.model.Person;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
public class ObjectSender {

    /**
     * 1.发送者 ，就是生产者
     */

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send( ) {
        Person person = new Person();
        person.setAge(20);
        person.setNamme("yxDemo");
         System.out.println("ObjectSender : " + person);
        this.rabbitTemplate.convertAndSend("queueyxObject", person); // routekey ,value
    }
}
