package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.ApplicationUsers.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
