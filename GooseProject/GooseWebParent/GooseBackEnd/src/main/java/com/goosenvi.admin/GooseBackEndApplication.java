package com.goosenvi.admin;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.goosenvi.common.entity", "com.goosenvi.admin.user"})
public class GooseBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(GooseBackEndApplication.class, args);
	}

}
