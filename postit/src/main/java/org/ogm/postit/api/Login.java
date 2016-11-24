package org.ogm.postit.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ogm.postit.api.model.User;
import org.ogm.postit.api.repo.PostitRepo;
import org.ogm.postit.api.repo.UserRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Login {
	  @GET
//	  @Path("{user}/{password}")
//	  public User login(@PathParam("user") String user,@PathParam("password") String password) {
	  public User login(User user){
		  
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
			String[] names = context.getBeanDefinitionNames();
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
			PostitRepo repo = (PostitRepo)context.getBean(PostitRepo.class.getSimpleName());
			System.out.println(repo.test());
			//UserRepo repo =  (UserRepo) context.getBean("UserRepo");
			//user = repo.get(1L);
		  //User u = new User();
		  //user.setNick("pepito");
		  return user;
	     //return Response.ok("application/json").entity("Hello "+user+"!!").build();
	  }
}
