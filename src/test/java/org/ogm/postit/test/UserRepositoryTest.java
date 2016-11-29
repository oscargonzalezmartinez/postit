package org.ogm.postit.test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.ogm.postit.api.model.User;
import org.ogm.postit.api.repo.UserRepository;
import org.ogm.postit.test.data.UserFactory;
import org.springframework.beans.factory.annotation.Autowired;
public class UserRepositoryTest  extends TestBase{

	@Autowired
	private UserRepository userRepository = null;
	
	@Test
	public void getUser(){
		User userAc = UserFactory.newUser();
		User user = userRepository.findOne(1L);
		
		assertThat(user, notNullValue());
		assertThat(user.getUser(), is(userAc.getUser()));
		assertThat(user.getName(), is(userAc.getName()));
		assertThat(user.getEmail(), is(userAc.getEmail()));

	}
}
