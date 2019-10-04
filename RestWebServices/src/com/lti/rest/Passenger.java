package com.lti.rest;

public class Passenger {
	private String name;
	private Status status;
	
	public static enum Status{
		RAC,WAITING,CONFIRMED;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
