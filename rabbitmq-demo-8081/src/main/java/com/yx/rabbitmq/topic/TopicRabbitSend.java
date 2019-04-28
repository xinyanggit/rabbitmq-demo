package com.yx.rabbitmq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author yx start
 * @create 2019/4/28,0:14
 */
@Component
public class TopicRabbitSend {

    /**
     * 1.发送者 ，就是生产者
     */

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 会匹配两个
     */
    public void send() {
        String context = "irisOne-->TopicRabbitSend-yx=================^V^" + System.currentTimeMillis();
        System.out.println("Sender : " + context);
//        this.rabbitTemplate.convertAndSend("queueyx", context); // routekey ,value
        rabbitTemplate.convertAndSend(TopicRabbitConfig.topicExchange,TopicRabbitConfig.irisOne,context);
    }

    /**
     * 只会匹配一个   #匹配0个或多个单词， *匹配一个单词
     */
    public  void sendAll(){
        String  context = "irisAll-->TopicRabbitSend-yx=================^V^" + System.currentTimeMillis();
        System.out.println("Sender : " + context);
//        this.rabbitTemplate.convertAndSend("queueyx", context); // routekey ,value
        rabbitTemplate.convertAndSend(TopicRabbitConfig.topicExchange,TopicRabbitConfig.irisAll,context);

    }
}
