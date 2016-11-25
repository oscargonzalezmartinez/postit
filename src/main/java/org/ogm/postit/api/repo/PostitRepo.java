package org.ogm.postit.api.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.ogm.postit.api.model.Postit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("PostitRepo")
@Transactional(propagation = Propagation.REQUIRED)
public class PostitRepo {

	@PersistenceContext
	private EntityManager entityManager = null;
	 
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public List<Postit> find(Long id) {
		
		
		String jpql = "SELECT p FROM PostitRepo p WHERE userId= :userId";
				Query query = entityManager.createQuery(jpql);
				query.setParameter("userId", id);

				return query.getResultList();

	}
	
	public List<Postit> test(){
		//Metamodel m = entityManager.getMetamodel();
		//EntityType<PostitRepo> Pet_ = m.entity(PostitRepo.class);
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Postit> cq = cb.createQuery(Postit.class);
		Root<Postit> root = cq.from(Postit.class);
		cq.select(root).where(cb.equal(root.get("userId"),1));
		return entityManager.createQuery(cq).getResultList();
	}
}
