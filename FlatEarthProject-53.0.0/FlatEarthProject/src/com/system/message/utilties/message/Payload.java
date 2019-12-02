package com.system.message.utilties.message;

public class Payload {
	
	public String attribute;
	public String code;
	public String description;
	
	Payload () {}

	public Payload(String attribute, String code, String description) {
		super();
		this.attribute = attribute;
		this.code = code;
		this.description = description;
	}
	
}
