package com.bsahu.message.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import com.bsahu.message.exception.MessageException;
import com.bsahu.message.model.MessageBO;

/**
 * @author bsahu
 *
 */
@Service
public interface OutgoingMessageService {
	@Retryable( value = RuntimeException.class, maxAttempts = 3, backoff = @Backoff(delay = 1000))
	public boolean sendMessage(MessageBO msg) throws MessageException;
}
