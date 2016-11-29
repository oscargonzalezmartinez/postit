package org.ogm.postit.test;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ogm.postit.api.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserRestControllerTest extends TestBase{

	@Test
	public void getUserInfo() throws Exception {
        mockMvc.perform(get("/user/1"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
       // .andExpect(jsonPath("$", hasSize(1)))
        .andExpect(jsonPath("$.user", is("ogm")))
        .andExpect(jsonPath("$.nombre", is("Oscar")))
        .andExpect(jsonPath("$.email", is("oscar@uncorreo.es")));

	}
}
