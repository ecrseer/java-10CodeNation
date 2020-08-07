package com.challenge.repository;

import com.challenge.entity.Acceleration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccelerationRepo extends CrudRepository<Acceleration,Long> {
    List<Acceleration> findAll();
    List<Acceleration> findByCandidatesIdCompanyId(Long companyId);

   // List<Acceleration> findByCompanyId(Long id);


}
