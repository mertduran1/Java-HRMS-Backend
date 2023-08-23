package com.example.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "candidates")
@Entity
public class Candidate {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "identity_number")
    private String identityNumber;
    @Column(name = "birth_year")
    private int birthYear;

    public Candidate(int id, String firstName, String lastName, String identityNumber, int birthYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.birthYear = birthYear;
    }

    public Candidate() {}
}
