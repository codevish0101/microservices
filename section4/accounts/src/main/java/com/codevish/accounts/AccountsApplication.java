package com.codevish.accounts;

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
                title = "Accounts Microservice Rest API Documentation",
                description = "CodeVish Accounts Microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Vishnu Chaturvedi",
                        email = "vishnu.chaturvedi@gmail.com",
                        url = "https://www.codevish.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.codevish.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                url = "https://www.codevish.com",
                description = "CodeVish Accounts Microservice REST API Documentation"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
