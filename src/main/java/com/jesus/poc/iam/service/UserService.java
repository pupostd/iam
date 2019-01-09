package com.jesus.poc.iam.service;

import com.jesus.poc.iam.domain.User;
import com.jesus.poc.iam.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jesus.poc.iam.domain.Sex;
import java.util.Date;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String firstName, String middleName, String lastName, Date dateOfBirth, Sex sex, Boolean active) {
        return userRepository.save(
                new User(firstName, middleName, lastName, dateOfBirth, sex, active)
        );
    }

    public Iterable<User> lookup() {
        return userRepository.findAll();
    }
}
