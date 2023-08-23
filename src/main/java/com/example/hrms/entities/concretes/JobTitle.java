package com.example.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "job_titles")
@Entity
public class JobTitle {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;

    public JobTitle(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public JobTitle() {}
}
