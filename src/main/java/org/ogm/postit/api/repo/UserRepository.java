package org.ogm.postit.api.repo;

import org.ogm.postit.api.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

}
