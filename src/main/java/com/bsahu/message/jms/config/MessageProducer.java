package com.bsahu.message.jms.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import com.bsahu.message.model.MessageBO;
import javax.jms.Queue;

/**
 * @author bsahu
 *
 */
@Configuration
public class MessageProducer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;
    
    private final static Logger logger = LoggerFactory.getLogger(MessageProducer.class);
   
    public boolean publish(MessageBO message) throws Exception{

    	logger.info("MessageProducer.publish()");
    	
        try {
			jmsTemplate.convertAndSend(queue, message);
		} catch (Exception e) {
			logger.error(e.getMessage());
			return false;
		}
        
        return true;
    }
}
