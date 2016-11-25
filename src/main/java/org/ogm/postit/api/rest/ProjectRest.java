package org.ogm.postit.api.rest;

import java.util.List;

import org.ogm.postit.api.model.Project;
import org.ogm.postit.api.model.User;
import org.ogm.postit.api.repo.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRest {
	@Autowired
	private ProjectRepository projectRepository = null;
	
	@RequestMapping("/project/user/{userId}")
	public List<Project> find(@PathVariable("userId") Long userId){
		User user = new User();
		user.setId(userId);

		return projectRepository.findAllByUsers(user);
	}
}
