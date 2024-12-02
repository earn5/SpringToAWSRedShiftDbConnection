package com.java.aws.redshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RedshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedshiftApplication.class, args);
	}

}
