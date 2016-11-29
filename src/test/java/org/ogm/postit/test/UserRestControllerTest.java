package org.ogm.postit.test;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.ogm.postit.api.model.User;
import org.ogm.postit.test.data.UserFactory;



public class UserRestControllerTest extends TestBase{

	@Test
	public void getUserInfo() throws Exception {
		User user = UserFactory.newUser();
        mockMvc.perform(get("/user/"+user.getId()))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.user", is(user.getUser())))
        .andExpect(jsonPath("$.name", is(user.getName())))
        .andExpect(jsonPath("$.email", is(user.getEmail())));

	}
}
