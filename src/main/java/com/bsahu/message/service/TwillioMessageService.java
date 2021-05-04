package com.bsahu.message.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsahu.message.config.twillio.TwillioBean;
import com.bsahu.message.exception.MessageException;
import com.bsahu.message.model.MessageBO;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 * @author bsahu
 *
 */
@Service
public class TwillioMessageService implements OutgoingMessageService {
    @Autowired
    TwillioBean twillio;
    private final static Logger logger = LoggerFactory.getLogger(TwillioMessageService.class);
    
	@Override
	public boolean sendMessage(MessageBO msg) throws MessageException{
		logger.info("TwillioMessageService.sendMessage()");
		logger.info("To Number   : " +msg.getToNumber());
		logger.info("From Number : " +twillio.getTrialNumber());
		logger.info("Account Sid : " +twillio.getAccountSid());
		Twilio.init(twillio.getAccountSid(), twillio.getAuthToken());
		Message message = null;
		try {
			message = Message.creator(
					new PhoneNumber("+91"+msg.getToNumber()), 
					new PhoneNumber(twillio.getTrialNumber()),
			        msg.getMessage()).create();
			logger.error("error code"+message.getErrorCode());
		} catch (Exception e) {
			throw new MessageException(e.getLocalizedMessage(),e);
		}

        return true;
	}
   
}
