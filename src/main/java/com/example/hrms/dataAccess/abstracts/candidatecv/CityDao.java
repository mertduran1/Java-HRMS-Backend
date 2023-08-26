package com.example.hrms.dataAccess.abstracts.candidatecv;

import com.example.hrms.entities.concretes.CandidateCV.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {

}
