package com.jesus.poc.iam;

import com.jesus.poc.iam.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IamApplication implements CommandLineRunner {

	@Autowired
	private CompanyService companyService;

	public static void main(String[] args) {
		SpringApplication.run(IamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		companyService.createCompany("LCBO", "Alcohol Retail Store", true);
		companyService.createCompany("Loblaws", "Supermarket", true);
		companyService.createCompany("TTC", "Toronto Transit Commission", true);


	}
}

