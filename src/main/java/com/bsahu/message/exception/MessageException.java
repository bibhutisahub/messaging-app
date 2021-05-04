package com.bsahu.message.exception;

/**
 * @author bsahu
 *
 */
public class MessageException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public MessageException(String message, Throwable cause) {
        super(message, cause);
    }

}
