package com.logo.cloud.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CorsavarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsavarApplication.class, args);
	}
}
