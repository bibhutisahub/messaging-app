package com.bsahu.message.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bsahu.message.exception.MessageException;
import com.bsahu.message.jms.config.MessageProducer;
import com.bsahu.message.model.MessageBO;

/**
 * @author bsahu
 *
 */
@Service
public class JMSProducerService implements IncommingMessageService{

    @Autowired
    MessageProducer producer;
    
    private final static Logger logger = LoggerFactory.getLogger(JMSProducerService.class);
    
	@Override
	public boolean pushMessage(MessageBO msg) throws MessageException {
		logger.info("JMSProducerService.push()");
		logger.info("Pushing the below message to AMQ");
		logger.info(msg.toString());
		try {
			producer.publish(msg);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new MessageException(e.getMessage(),e);
		}
		return false;
	}



}
