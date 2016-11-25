package org.ogm.postit.api.repo;

import java.util.List;

import org.ogm.postit.api.model.Project;
import org.ogm.postit.api.model.User;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long>{

	public List<Project> findAllByUsers(User user);
}
