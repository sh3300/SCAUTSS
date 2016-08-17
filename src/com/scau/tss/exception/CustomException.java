package com.scau.tss.exception;

public class CustomException extends Exception {

	private static final long serialVersionUID = -4395150288865479758L;

	private String message;

	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
