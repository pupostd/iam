package com.jesus.poc.iam.repo;

import com.jesus.poc.iam.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findById(Integer id);
}
