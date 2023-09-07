package com.springboot.couchbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

//lombok annotation
@Slf4j
//spring annotation
@SpringBootApplication
public class SpringbootandcouchbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootandcouchbaseApplication.class, args);
	}
}
