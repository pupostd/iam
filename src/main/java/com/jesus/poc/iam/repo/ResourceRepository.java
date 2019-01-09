package com.jesus.poc.iam.repo;

import com.jesus.poc.iam.domain.Resource;
import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<Resource, String> {
    Resource findByName(String name);
}
