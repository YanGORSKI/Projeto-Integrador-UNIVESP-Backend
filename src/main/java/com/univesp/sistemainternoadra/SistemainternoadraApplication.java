package com.univesp.sistemainternoadra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.univesp.sistemainternoadra"})
@EnableJpaRepositories(basePackages = "com.univesp.sistemainternoadra")
public class SistemainternoadraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemainternoadraApplication.class, args);
	}

}
