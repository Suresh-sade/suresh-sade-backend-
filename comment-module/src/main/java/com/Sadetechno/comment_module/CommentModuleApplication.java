package com.Sadetechno.comment_module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CommentModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentModuleApplication.class, args);
	}

}
