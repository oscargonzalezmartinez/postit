package org.ogm.postit.test;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.ogm.postit.api.model.Postit;
import org.ogm.postit.test.data.PostitFactory;
import org.ogm.postit.test.matcher.LongMatcher;



public class PostitRestControllerTest extends TestBase{


	
	@Test
	public void getPostit() throws Exception {
		Postit postit = PostitFactory.newPostit();
        mockMvc.perform(get("/postit/"+postit.getId()))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        //.andDo(print())
        .andExpect(jsonPath("$.userId", LongMatcher.isLong(postit.getUserId())))
        .andExpect(jsonPath("$.title", is(postit.getTitle())))
        .andExpect(jsonPath("$.text", is(postit.getText())));

	}
}
