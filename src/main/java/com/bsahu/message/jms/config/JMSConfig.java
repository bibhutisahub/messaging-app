package com.bsahu.message.jms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.context.annotation.Bean;
import org.apache.activemq.command.ActiveMQQueue;
import javax.jms.Queue;


/**
 * @author bsahu
 *
 */
@Configuration
@EnableJms
public class JMSConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("message.queue");
    }
}
