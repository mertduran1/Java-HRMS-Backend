package com.example.hrms.entities.concretes;

import com.example.hrms.entities.concretes.ApplicationUsers.Employer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "job_titles")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;

    @ManyToOne()
    @JoinColumn(name = "employers")
    private Employer employer;

}
