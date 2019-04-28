package com.yx.rabbitmq.Fanout;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yx start
 * @create 2019/4/28,15:10
 */
@Configuration
public class FanoutRabbitConfig {
    final static String irisOne = "fanout.One";
    final static String irisTwo = "fanout.Two";
    final static String irisThree = "fanout.Three";
    final static String topicExchange = "fanout.topicExchange";
    //  交换器  queue  bind  实现动态输出给消费方
    /**
     * 队列
     *
     * @return
     */
    @Bean
    public Queue queueIrisOne1() {
        return new Queue(FanoutRabbitConfig.irisOne);
    }
    @Bean
    public Queue queueIrisTwo() {
        return new Queue(FanoutRabbitConfig.irisTwo);
    }
    @Bean
    public Queue queueIrisThree() {
        return new Queue(FanoutRabbitConfig.irisThree);
     }
    /**
     * 交换器
     *
     * @return
     */
    @Bean
    public FanoutExchange exchangeFanout() {
        return new FanoutExchange(FanoutRabbitConfig.topicExchange);
    }
    /***
     * 1.生产者将消息推送到 Exchange 交换器
     * 2.bind 将交换器的的消息发送给那个队列
     * @param queueIrisOne1
     * @param exchangeFanout
     * @return
     */
    @Bean
    Binding bindingExchangeQueueOne1(Queue queueIrisOne1, FanoutExchange exchangeFanout) {
        //with routingKey
        return BindingBuilder.bind(queueIrisOne1).to(exchangeFanout);
    }

    @Bean
    Binding bindingExchangeQueueTwo(Queue queueIrisTwo, FanoutExchange exchangeFanout) {
        return BindingBuilder.bind(queueIrisTwo).to(exchangeFanout);
    }
    @Bean
    Binding bindingExchangeQueuethree(Queue queueIrisThree, FanoutExchange exchangeFanout) {
        return BindingBuilder.bind(queueIrisThree).to(exchangeFanout);
    }

}
