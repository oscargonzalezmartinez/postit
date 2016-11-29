package org.ogm.postit.test;

import org.junit.Test;
import org.ogm.postit.api.model.User;
import org.ogm.postit.api.repo.PostitRepository;
import org.ogm.postit.test.data.UserFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PostitRepositoryTest extends TestBase{

	@Autowired
	private PostitRepository postitRepository = null;
	
	@Test
	public void findPostItByUser(){
		User user = UserFactory.newUser();
		postitRepository.findByUserId(user.getId());
	}
}
