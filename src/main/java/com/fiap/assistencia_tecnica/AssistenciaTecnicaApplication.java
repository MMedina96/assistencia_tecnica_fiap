package com.fiap.assistencia_tecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fiap.assistencia_tecnica.resources.repository"})
public class AssistenciaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssistenciaTecnicaApplication.class, args);
	}

}
