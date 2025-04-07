package com.shivaji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}


// Here no need to annotate @EnableEurekaClient because from Spring Boot 2.4+, 
// @EnableEurekaClient is no longer needed because Spring Boot automatically detects 
// spring-cloud-starter-netflix-eureka-client and registers the service. Instead, we just
// need to configure application.properties or application.yml with 
//
// eureka.client.service-url.defaultZone=http://localhost:8761/eureka
