package com.example.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "location_types")
@AllArgsConstructor
@NoArgsConstructor
public class LocationType {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "location_type_name")
    private String locationTypeName;

    @OneToMany(mappedBy = "locationType")
    private List<JobAdvertisement> jobAdvertisements;
}
