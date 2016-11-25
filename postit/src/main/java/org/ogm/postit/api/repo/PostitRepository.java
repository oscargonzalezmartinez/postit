package org.ogm.postit.api.repo;

import org.ogm.postit.api.model.Postit;
import org.springframework.data.repository.CrudRepository;

public interface PostitRepository extends CrudRepository<Postit, Long>{

}
