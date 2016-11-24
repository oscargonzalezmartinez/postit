package org.ogm.postit.api;

import org.ogm.postit.api.model.User;
import org.ogm.postit.api.repo.PostitRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginS {
	  @RequestMapping("/logins")
	  public User login(User user){
		  
			ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
			String[] names = context.getBeanDefinitionNames();
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
			PostitRepo repo = (PostitRepo)context.getBean(PostitRepo.class.getSimpleName());
			System.out.println(repo.test());
			//UserRepo repo =  (UserRepo) context.getBean("UserRepo");
			//user = repo.get(1L);
		  //User u = new User();
		  //user.setNick("pepito");
		  return user;
	     //return Response.ok("application/json").entity("Hello "+user+"!!").build();
	  }
}
