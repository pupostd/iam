package com.jesus.poc.iam.service;

import com.jesus.poc.iam.domain.Company;
import com.jesus.poc.iam.repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(String name, String description, Boolean active) {
        return companyRepository.save(
                new Company(name, description, active)
        );
    }
}
