package com.challenge.service;

import com.challenge.entity.User;
import com.challenge.repository.UserRepo;
import com.challenge.service.interfaces.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class UserService implements UserServiceInterface {
    @Autowired private UserRepo userRepo;


    public List<User> findAll(){
        return this.userRepo.findAll();
    }

    @Override
    public Optional<User> findById(Long userId) {
        return this.userRepo.findById(userId);
    }

    @Override
    public List<User> findByAccelerationName(String name) {
        return this.userRepo.findByCandidatesIdAccelerationName(name);
    }

    @Override
    public List<User> findByCompanyId(Long companyId) {
        return this.userRepo.findByCandidatesIdCompanyId(companyId);
    }

    @Override
    public User save(User object) {
        object.setCreatedAt(LocalDateTime.now());
        return userRepo.save(object);
    }
}
