package com.vicky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class OpenShiftStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenShiftStartApplication.class, args);
	}
	
}
