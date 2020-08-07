package com.challenge.service;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepo;
import com.challenge.service.interfaces.SubmissionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

public class SubmissionService implements SubmissionServiceInterface {
    @Autowired private SubmissionRepo submissionRepo;

    @Override
    public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
        return submissionRepo.findHighestScoreByChallengeId(challengeId);
    }

    @Override
    public List<Submission> findByChallengeIdAndAccelerationId(
            Long challengeId, Long accelerationId) {
        return submissionRepo.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
    }

    @Override
    public Submission save(Submission object) {
        return submissionRepo.save(object);
    }
}
