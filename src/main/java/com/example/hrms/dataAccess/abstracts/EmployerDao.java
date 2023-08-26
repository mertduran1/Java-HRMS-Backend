package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.ApplicationUsers.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
    boolean existsByCompanyName(String companyName);
    boolean existsByWebAddress(String webAddress);
}
