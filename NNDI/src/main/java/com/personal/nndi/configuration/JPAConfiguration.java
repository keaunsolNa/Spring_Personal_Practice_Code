package com.personal.nndi.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.personal.nndi"})
@EnableJpaRepositories(basePackages = "com.personal.nndi")
public class JPAConfiguration {

}
