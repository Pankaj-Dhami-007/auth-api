package com.neepanklok.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RegistrationDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String phoneNo;
    private LocalDateTime createdAt;
    private Boolean isActive;
    private String role;
}
