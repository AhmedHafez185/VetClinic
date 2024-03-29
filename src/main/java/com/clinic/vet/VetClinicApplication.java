package com.clinic.vet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class VetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetClinicApplication.class, args);
	}

}
