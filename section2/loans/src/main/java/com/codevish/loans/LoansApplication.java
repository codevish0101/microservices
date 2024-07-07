package com.codevish.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "Codevish Loans microservice REST API Documentation",
				contact = @Contact(
						name = "Vishnu Chaturvedi",
						url = "https://www.codevish.com",
						email = "codevish0101@gmail.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.codevish.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Codevish Loans microservice REST API Documentation",
				url = "https://www.codevish.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
