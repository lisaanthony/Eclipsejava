package com.lti.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductService {
	
         @POST
         @Consumes(MediaType.APPLICATION_JSON)
         @Produces(MediaType.APPLICATION_JSON)
         public Status add(Product product) {
        	 //call to the DAO class for storing the
        	 //product data in the DB missing right now
        	 Status status=new Status();
        	 status.setMessage("Product added successfully");
        	 return status;
        	 
         }
	
}
