package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }
    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }
}
