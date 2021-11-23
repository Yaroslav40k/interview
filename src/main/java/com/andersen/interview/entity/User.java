package com.andersen.interview.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name = "user")
public class User {

    public enum Role {
        SUPER_ADMIN,
        ADMIN,
        DOCTOR,
        PATIENT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String passwordHash;

    @Column(name = "is_active")
    private boolean is_active = true;

    @Column
    @Enumerated(EnumType.STRING)
    private Role role;


}
