package com.example.hrms.entities.concretes;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "employers")
@Entity
public class Employer {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "web_address")
    private String webAddress;
    @Column(name = "phone_number")
    private String phoneNumber;

    public Employer(int id, String companyName, String webAddress, String phoneNumber) {
        this.id = id;
        this.companyName = companyName;
        this.webAddress = webAddress;
        this.phoneNumber = phoneNumber;
    }

    public Employer() {}

}
