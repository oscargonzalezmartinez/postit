package org.ogm.postit.api.rest;

import org.ogm.postit.api.model.User;
import org.ogm.postit.api.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	
	@Autowired
	private UserRepository userRepo = null;
	@RequestMapping("/login")
//	  @Path("{user}/{password}")
//	  public User login(@PathParam("user") String user,@PathParam("password") String password) {
	  public User login(User user){
		return userRepo.findOne(1l);
	  }
}
