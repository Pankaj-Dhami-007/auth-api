package com.neepanklok.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    private String username;
    private String email;
    private String password;
    private String phoneNo;
    private Long roleId;
    private Long clientId;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private String role;

}
