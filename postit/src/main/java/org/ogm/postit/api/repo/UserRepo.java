package org.ogm.postit.api.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ogm.postit.api.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("UserRepo")
@Transactional(propagation = Propagation.REQUIRED)
public class UserRepo {

	@PersistenceContext
	private EntityManager entityManager = null;
	 
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public User get(Long id) {
		return entityManager.find(User.class, id );
	}
}
