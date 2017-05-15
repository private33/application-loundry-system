package com.loundry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.loundry")
@SpringBootApplication
public class AplikasiLoundrySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplikasiLoundrySystemApplication.class, args);
	}
}
