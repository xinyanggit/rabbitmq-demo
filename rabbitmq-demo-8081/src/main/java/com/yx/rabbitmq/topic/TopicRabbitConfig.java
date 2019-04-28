package com.yx.rabbitmq.topic;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yx start
 * @create 2019/4/28,15:10
 */
@Configuration
public class TopicRabbitConfig {
    final static String irisOne = "topic.iris";
    final static String irisAll = "topic.irisAll";
    final static String topicExchange = "topicExchange";
    //  交换器  queue  bind  实现动态输出给消费方
    /**
     * 队列
     * @return
     */
    @Bean
    public Queue queueIrisOne() {
        return new Queue(TopicRabbitConfig.irisOne);
    }
    @Bean
    public Queue queueIrisAll() {
        return new Queue(TopicRabbitConfig.irisAll);
    }
    /**
     * 交换器
     * @return
     */
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(TopicRabbitConfig.topicExchange);
    }
    /***
     * 1.生产者将消息推送到 Exchange 交换器
     * 2.bind 将交换器的的消息发送给那个队列
     * 3.消费者去队列里面取值进行消费
     * @param queueIrisOne
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue queueIrisOne, TopicExchange exchange){
        //with routingKey
        return BindingBuilder.bind(queueIrisOne).to(exchange).with("topic.iris") ;
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueIrisAll, TopicExchange exchange){
        //with routingKey   #匹配0个或多个单词， *匹配一个单词
        return BindingBuilder.bind(queueIrisAll).to(exchange).with("topic.#") ;
    }




}
