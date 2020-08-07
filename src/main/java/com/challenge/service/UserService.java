package com.challenge.service;

import com.challenge.entity.User;
import com.challenge.repository.UserRepo;
import com.challenge.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class UserService implements UserServiceInterface {
    @Autowired private UserRepo userRepo;


    public List<User> findAll(){
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Long userId) {
        return userRepo.findById(userId);
    }

    @Override
    public List<User> findByAccelerationName(String name) {
        return userRepo.findByCandidatesIdAccelerationName(name);
    }

    @Override
    public List<User> findByCompanyId(Long companyId) {
        return userRepo.findByCandidatesIdCompanyId(companyId);
    }

    @Override
    public User save(User object) {

        return userRepo.save(object);
    }
}
