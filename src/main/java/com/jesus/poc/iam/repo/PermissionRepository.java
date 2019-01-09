package com.jesus.poc.iam.repo;

import com.jesus.poc.iam.domain.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionRepository extends CrudRepository<Permission, String> {
    Permission findByName(String name);
}
