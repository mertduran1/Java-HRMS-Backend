package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.ApplicationUsers.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Comparator;
import java.util.List;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
    List<Employer> getAllByCompanyName(String employerName);
}
