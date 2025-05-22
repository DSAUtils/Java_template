package com.template.security.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@OpenAPIDefinition(info = @Info(contact = @Contact(name = "Hono UWINEZA", email = "contact@gmail.com", url = "http://localhost:8040/guest"), description = "OpenApi documentation for Vehicle Tracking Management System", title = "OpenApi specification - Hono ", license = @License(name = "MIT", url = "https://some-url.com"), termsOfService = "Terms of service"), servers = {
//                @Server(description = "Local ENV", url = "http://localhost:8040/api/v1"
//
//                ),
//                @Server(description = "Prod ENV", url = "https://api.vms.com"
//
//                )
//}, security = {
//                @SecurityRequirement(name = "bearerAuth")
//})
//@SecurityScheme(name = "bearerAuth", description = "JWT auth description", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", in = SecuritySchemeIn.HEADER
//
//)


@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Security API")
                        .version("1.0")
                        .contact(new Contact()
                                .email("hono@gmail.com")
                        .name("Hono"))
                        .description("Security API")).addSecurityItem(new SecurityRequirement().addList("BearerAuth"))
                .components(new Components()
                        .addSecuritySchemes("BearerAuth", new SecurityScheme()
                                .name("BearerAuth")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}