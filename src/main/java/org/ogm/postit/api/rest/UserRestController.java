package org.ogm.postit.api.rest;

import org.ogm.postit.api.model.User;
import org.ogm.postit.api.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@Autowired
	private UserRepository userRepository = null;

	@RequestMapping(path="/user/{userId}")
	public User get(@PathVariable("userId") Long userId){
		return userRepository.findOne(userId);
	}
}
