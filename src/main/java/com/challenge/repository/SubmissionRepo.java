package com.challenge.repository;

import com.challenge.entity.Submission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface SubmissionRepo extends CrudRepository<Submission, Long> {

    @Query(value = "select * from submission sm inner join" +
            " acceleration ac on sm.challenge_id=ac.challenge_id" +
            "where sm.challenge_id=?1 and ac.id=?2",nativeQuery = true)
    List<Submission> findByChallengeIdAndAccelerationId(Long challengeId,
                                                        Long accelerationId);

    @Query(value = "select coalesce(max(score),0) from submission where challenge_id=?1",
            nativeQuery = true)
    BigDecimal findHighestScoreByChallengeId(Long challengeId);

}
