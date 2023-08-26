package com.example.hrms.entities.concretes.CandidateCV;

import com.example.hrms.entities.concretes.ApplicationUsers.Candidate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "candidate_images")
public class CandidateImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "storage_name")
    @Enumerated(EnumType.STRING)
    private StorageType storageType;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
