package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
    List<Candidate> getAllByFirstNameAndLastName(String firstName, String lastName);
    boolean existsByIdentityNumber(String identityNumber);
}
