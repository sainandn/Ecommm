package com.ecomm.Ecomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.ecomm.dto")
@EnableJpaRepositories("com.ecomm.repo")
@ComponentScan({"com.ecomm.controller","com.ecomm.service"})
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class EcommApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommApplication.class, args);
	}

}
