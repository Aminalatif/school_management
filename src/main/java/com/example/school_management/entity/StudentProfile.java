package com.example.school_management.entity;

import jakarta.persistence.*;

@Entity
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dateOfBirth;
    private String address;
    private String contactInfo;

    @OneToOne(mappedBy = "profile")
    private Student student;

    // Constructors, Getters, and Setters
}

