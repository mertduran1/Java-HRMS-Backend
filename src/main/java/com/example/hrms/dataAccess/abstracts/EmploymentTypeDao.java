package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.EmploymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentTypeDao extends JpaRepository<EmploymentType, Integer> {
}
