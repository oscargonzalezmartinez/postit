package org.ogm.postit.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	/*
    	 * 		System.out.println("DB " + System.getenv("DATABASE_URL"));
        String webPort = System.getenv("PORT");
        if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }
    	 * */
        SpringApplication.run(Application.class, args);
    }
}
