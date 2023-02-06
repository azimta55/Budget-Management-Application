package com.BudgetApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.BudgetApplication.*" })
@EntityScan({ "com.BudgetApplication.Model" })
@EnableJpaRepositories({ "com.BudgetApplication.Repository" })
@EnableCaching
@SpringBootApplication
public class BudgetManagamentApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BudgetManagamentApplication.class, args);
		/* Project By Azim T.A */
		
	}

}
