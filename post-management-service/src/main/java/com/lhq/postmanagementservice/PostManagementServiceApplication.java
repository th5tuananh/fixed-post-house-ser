package com.lhq.postmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import feign.RequestInterceptor;


@SpringBootApplication
@EnableFeignClients("com.lhq.postmanagementservice")
@EnableDiscoveryClient
public class PostManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostManagementServiceApplication.class, args);
	}
		

}
