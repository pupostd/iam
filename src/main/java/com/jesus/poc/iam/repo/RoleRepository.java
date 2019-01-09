package com.jesus.poc.iam.repo;

import com.jesus.poc.iam.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, String> {
    Role findByName(String name);
}
