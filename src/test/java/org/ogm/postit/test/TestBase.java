package org.ogm.postit.test;

import static org.junit.Assert.assertNotNull;

import java.nio.charset.Charset;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestBase {
    MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    MockMvc mockMvc = null;
    HttpMessageConverter mappingJackson2HttpMessageConverter;

    @Autowired
    private WebApplicationContext webApplicationContext = null;
    
    @Autowired
    void setConverters(HttpMessageConverter<?>[] converters) {
    	for (HttpMessageConverter<?> httpMessageConverter : converters) {
			if (httpMessageConverter instanceof MappingJackson2HttpMessageConverter){
				mappingJackson2HttpMessageConverter = httpMessageConverter;
			}
		}

        assertNotNull("the JSON message converter must not be null",
               this.mappingJackson2HttpMessageConverter);
    }

                
    @Before
    public void setup() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
}
