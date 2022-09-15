package com.yash.IOCAssignment_4_modul;

public class ConstructorMessage {

	private String message=null;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
	
}
