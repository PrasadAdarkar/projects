package com.abnamro.springboot.library.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.abnamro.springboot.library"})
@EnableJpaRepositories("com.abnamro.springboot.library.repositories")
@EntityScan("com.abnamro.springboot.library")
public class LibraryApplication {
//first app new
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
