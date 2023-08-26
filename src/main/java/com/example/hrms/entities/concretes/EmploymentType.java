package com.example.hrms.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "employment_types")
@AllArgsConstructor
@NoArgsConstructor
public class EmploymentType {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "employment_type_name")
    private String employmentTypeName;

    @OneToMany(mappedBy = "employmentType")
    private List<JobAdvertisement> jobAdvertisements;
}
