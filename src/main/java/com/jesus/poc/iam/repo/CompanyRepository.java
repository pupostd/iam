package com.jesus.poc.iam.repo;

import com.jesus.poc.iam.domain.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, String> {
    Company findByName(String name);
}
