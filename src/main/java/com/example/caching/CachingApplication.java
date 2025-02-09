package com.example.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching; //actualizado


@SpringBootApplication
@EnableCaching //actualizado
public class CachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingApplication.class, args);
	}

}
