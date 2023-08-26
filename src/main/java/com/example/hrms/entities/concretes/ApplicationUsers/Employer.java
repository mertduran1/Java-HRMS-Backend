package com.example.hrms.entities.concretes.ApplicationUsers;


import com.example.hrms.entities.concretes.JobTitle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name = "employers")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "web_address")
    private String webAddress;
    @Column(name = "phone_number")
    private String phoneNumber;

    //Employer a iş ilanlarını kaydediyoruz
    @OneToMany(mappedBy = "employer")
    private List<JobTitle> jobTitles;

}
