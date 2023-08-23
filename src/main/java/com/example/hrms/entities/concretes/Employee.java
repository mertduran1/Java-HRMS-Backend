package com.example.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "employees")
@Entity
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(){}

}
