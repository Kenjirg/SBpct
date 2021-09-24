package com.sb.j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({"com.sb.controller","com.sb.service","com.sb.dao","com.sb.entity"})
@SpringBootApplication
public class SBpctApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBpctApplication.class, args);
	}

}
