package com.lti.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Hello")
public class HelloService {
	
	@GET
	public String hello() {
		return "Hello from JAX-RS";   //response
	}

}
