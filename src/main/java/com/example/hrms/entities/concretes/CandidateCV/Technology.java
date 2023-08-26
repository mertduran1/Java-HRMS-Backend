package com.example.hrms.entities.concretes.CandidateCV;

import com.cloudinary.Cloudinary;
import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

@Data
@Entity
@Table(name = "technologies")
@AllArgsConstructor
@NoArgsConstructor
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "technology_name")
    private String technologyName;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
