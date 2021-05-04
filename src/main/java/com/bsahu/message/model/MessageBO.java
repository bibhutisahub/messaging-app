package com.bsahu.message.model;

import java.io.Serializable;

/**
 * @author bsahu
 *
 */
public class MessageBO implements Serializable{

    


	private static final long serialVersionUID = 1L;
	
	private String toNumber;
	private String message;
	
	public MessageBO() {}
	
	public MessageBO(String toNumber, String message) {
		super();
		this.toNumber = toNumber;
		this.message = message;
	}
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    @Override
	public String toString() {
		return "MessageBO [toNumber=" + toNumber + ", message=" + message + "]";
	}
	
}
