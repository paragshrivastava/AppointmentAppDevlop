package com.un.restservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;



@Path("/schedule")
@Produces("application/json")
public class ScheduleRestService {
 
	@GET
	public Response getAvailableSchedules(@QueryParam("param") String msg) {
 
		//TODO
 
		return Response.status(200).entity(null).build();
 
	}
 
}