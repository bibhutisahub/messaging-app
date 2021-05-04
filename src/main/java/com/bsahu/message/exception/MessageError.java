package com.bsahu.message.exception;


/**
 * @author bsahu
 *
 * The Class MessageError.
 */
public class MessageError {

	/** The error code. */
	private int errorCode;
	
	/** The error message. */
	private String errorMessage;
	
	/**
	 * Instantiates a new message error.
	 */
	public MessageError() {
		
	}

	/**
	 * Instantiates a new message error.
	 *
	 * @param errorCode the error code
	 * @param errorMessage the error message
	 */
	public MessageError(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the error code
	 */
	public int getErrorCode() {
		return errorCode;
	}
	
	/**
	 * Sets the error code.
	 *
	 * @param errorCode the new error code
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	/**
	 * Gets the error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	
	/**
	 * Sets the error message.
	 *
	 * @param errorMessage the new error message
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
