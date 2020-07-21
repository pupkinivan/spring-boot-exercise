package com.eldar.users.configs;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

// import io.swagger.models.Contact; // cuál de los dos va? swagger o springfox?
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
            .build()
            .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
            "Eldar users API",
            "This API contains services for getting user information and creating new users.",
            "1.0",
            "https://apod.nasa.gov/apod/astropix.html",
            new Contact(
                "Eldar SRL",
                "https://eldars.com.ar",
                "rrhh@eldars.com.ar"),
            "Terms of Service",
            "https://en.wikipedia.org/wiki/BSD_licenses",
            Collections.emptyList());
    }
}