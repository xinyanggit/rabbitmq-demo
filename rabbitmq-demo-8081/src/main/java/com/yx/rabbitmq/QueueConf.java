package com.yx.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yx start
 * @create 2019/4/28,14:04
 */

@Configuration
public class QueueConf {
    @Bean
    public Queue helloQueue() {
        return new Queue("queueyx");
    }

    /**
     * 多对多
     * @return
     */
    @Bean
    public Queue helloQueueMany() {
        return new Queue("queueyxMany");
    }

    /***
     * 传输对象
     */

    @Bean
    public Queue helloQueueObject() {
        return new Queue("queueyxObject");
    }


}
