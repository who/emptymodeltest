package com.github.who.emptymodeltest;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
import springfox.documentation.spi.DocumentationType;
import static springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.spring.web.plugins.Docket;
 
@Configuration
@EnableSwagger2
public class SpringfoxConfig {
     
    @Bean
    public Docket configSpringfoxDocket() {       
        return new Docket(DocumentationType.SWAGGER_2)
            .produces(Sets.newHashSet("application/json")) 
            .consumes(Sets.newHashSet("application/json")) 
            .protocols(Sets.newHashSet("http", "https")) 
            .forCodeGeneration(true) 
            .select().paths(regex(".*testing.*")) 
            .build();
    }
}