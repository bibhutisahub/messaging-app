package com.bsahu.message.jms.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import com.bsahu.message.model.MessageBO;

import com.bsahu.message.service.OutgoingMessageService;

/**
 * @author bsahu
 *
 */
@Component
public class MessageConsumer {

	@Autowired
	OutgoingMessageService service;
	
	private final static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
	
    @JmsListener(destination = "message.queue")
    public void listener(MessageBO message) {
    	logger.info("MessageConsumer.listener()");
        logger.info("Received Message: " + message.toString());
        try {
			service.sendMessage(message);
		} catch (Exception e) {
			logger.error(e.getMessage());
			//throw e;			
		}
    }
}
