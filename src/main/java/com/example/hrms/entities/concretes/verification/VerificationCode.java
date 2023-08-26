package com.example.hrms.entities.concretes.verification;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "verification_codes")
@Entity
public class VerificationCode {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "is_verified")
    private boolean isVerified = true;

    @Column(name = "verified_date")
    private Date verifiedDate;

}
