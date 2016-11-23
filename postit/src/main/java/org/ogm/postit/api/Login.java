package org.ogm.postit.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ogm.postit.api.model.User;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Login {
	  @POST
//	  @Path("{user}/{password}")
//	  public User login(@PathParam("user") String user,@PathParam("password") String password) {
	  public User login(User user){
		  //User u = new User();
		  user.setNick("pepito");
		  return user;
	     //return Response.ok("application/json").entity("Hello "+user+"!!").build();
	  }
}
