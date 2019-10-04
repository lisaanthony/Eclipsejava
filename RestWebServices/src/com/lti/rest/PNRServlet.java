package com.lti.rest;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

@Path("/pnr")
public class PNRServlet {
	
	@GET
    //@Produces("application/xml")     //content type
	@Produces({"application/json" ,"application/xml"})
	public Pnr check(@QueryParam("pnrNo") int pnrNo,@Context HttpServletResponse response){
		  response.setHeader("Access-Control-Allow-Origin","http://localhost:4200");
		
		PnrDao dao = new PnrDao();
		return dao.fetch(pnrNo);
		
 }
}
