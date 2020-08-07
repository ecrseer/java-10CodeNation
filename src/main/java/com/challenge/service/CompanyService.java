package com.challenge.service;

import com.challenge.entity.Company;
import com.challenge.repository.CompanyRepo;
import com.challenge.service.interfaces.CompanyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CompanyService implements CompanyServiceInterface {
    @Autowired private CompanyRepo companyRepo;

    @Override
    public Optional<Company> findById(Long id) {
        return companyRepo.findById(id);
    }

    @Override
    public List<Company> findByAccelerationId(Long accelerationId) {
        return companyRepo.findDistinctByCandidatesIdAccelerationId(accelerationId);
    }

    @Override
    public List<Company> findByUserId(Long userId) {
        return companyRepo.findByCandidatesIdUserId(userId);
    }

    @Override
    public Company save(Company object) {
        return companyRepo.save(object);
    }
}
