package com.cjc.app.mfi.master.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableEurekaClient
@EnableJpaRepositories
@SpringBootApplication
@EntityScan

public class MicrofinanceClient2OeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrofinanceClient2OeApplication.class, args);
	}

}
