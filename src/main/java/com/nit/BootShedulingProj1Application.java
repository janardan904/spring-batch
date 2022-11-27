package com.nit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootShedulingProj1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootShedulingProj1Application.class, args);
		System.out.println("application started at "+new Date());
	}

}
