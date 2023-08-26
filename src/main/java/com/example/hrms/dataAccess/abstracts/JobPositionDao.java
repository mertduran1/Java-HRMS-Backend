package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
    boolean existsByJobPositionName(String jobPositionName);
}
