package com.codevish.cards;

import com.codevish.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Codevish Cards microservice REST API Documentation",
				contact = @Contact(
						name = "Vishnu Chaturvedi",
						url = "https://www.codevish,com",
						email = "vishnu.chaturvedi@codevish.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.codevish.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				url = "https://www.codevish.com/swagger-ui.html",
				description = "Codevish Cards microservice REST API Documentation"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
