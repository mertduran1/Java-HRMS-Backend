package com.example.hrms.business.abstracts;

import com.example.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
