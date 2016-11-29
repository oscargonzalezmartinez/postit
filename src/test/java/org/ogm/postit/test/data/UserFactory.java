package org.ogm.postit.test.data;

import org.ogm.postit.api.model.User;

public class UserFactory {

	public static User newUser(){
		User user = new User();
		user.setId(1L);
		user.setEmail("oscar@uncorreo.es");
		user.setUser("ogm");
		user.setName("Oscar");
		return user;
	}
}
