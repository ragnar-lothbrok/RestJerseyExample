package com.test.service;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Path("/callservice")	
public class RestService {
	public static final Logger logger = Logger.getLogger(RestService.class);

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String processResponse(@Context HttpServletRequest requestContext,@Context SecurityContext context,
			@QueryParam("Username") String username,
			@QueryParam("Password") String password){
		
		String responseXML = "<credentials><username>"+username+
				"</username><password>"+password+"</password></credentials>";
		
		return responseXML;
	}
}
