package com.rohi.third.rating_data_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@EnableDiscoveryClient
public class RatingDataServiceApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RatingDataServiceApplication.class);
	}
}
