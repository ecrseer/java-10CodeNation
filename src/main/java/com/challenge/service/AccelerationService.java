package com.challenge.service;


import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepo;
import com.challenge.service.interfaces.AccelerationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccelerationService implements AccelerationServiceInterface {
    @Autowired
    private AccelerationRepo reposito;


    @Override
    public Optional<Acceleration> findById(Long id) {
        return reposito.findById(id);
    }

    @Override
    public List<Acceleration> findByCompanyId(Long companyId) {
        return reposito.findByCandidatesIdCompanyId(companyId);
    }

    @Override
    public Acceleration save(Acceleration object) {
        return reposito.save(object);
    }


    public List<Acceleration> findAll() {
        return this.reposito.findAll();
    }


}
