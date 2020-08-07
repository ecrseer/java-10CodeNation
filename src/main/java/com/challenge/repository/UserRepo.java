package com.challenge.repository;

import com.challenge.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findAll();
    List<User> findByCandidatesIdAccelerationName(String accelerationName);
    List<User> findByCandidatesIdCompanyId(Long companyId);
}
