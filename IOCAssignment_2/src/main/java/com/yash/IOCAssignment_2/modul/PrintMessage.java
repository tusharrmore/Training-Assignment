package com.yash.IOCAssignment_2.modul;

public class PrintMessage {
	
	private String message="yash";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PrintMessage [message=" + message + "]";
	}
	
}
