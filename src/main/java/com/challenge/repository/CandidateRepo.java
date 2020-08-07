package com.challenge.repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CandidateRepo extends CrudRepository<Candidate,CandidateId> {


    List<Candidate> findByIdCompanyId(CandidateId id);

    List<Candidate> findByIdCompanyId(Long companyId);

    List<Candidate> findByIdAccelerationId(Long accelerationId);

    Optional<Candidate> findByIdUserIdAndIdCompanyIdAndIdAccelerationId(
            Long userId,
            Long companyId,
            Long accelerationId);
}
