package com.example.hrms.dataAccess.abstracts;

import com.example.hrms.entities.concretes.LocationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationTypeDao extends JpaRepository<LocationType, Integer> {

}
