package com.neepanklok.mappers;

import com.neepanklok.dtos.RegistrationDTO;
import com.neepanklok.entities.User;

import java.time.LocalDateTime;

public class ModelMapper {
    // user to dto
    public static RegistrationDTO userToDto(User user){
        RegistrationDTO dto = new RegistrationDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        dto.setEmail(user.getEmail());
        dto.setPhoneNo(user.getPhoneNo());
        dto.setRole("ROLE_USER");
        dto.setCreatedAt(LocalDateTime.now());
        dto.setIsActive(true);
        return dto;
    }

    // dto to user

    public static User dtoToUser(RegistrationDTO dto){
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());
        user.setPhoneNo(dto.getPhoneNo());
        user.setRole("ROLE_USER");
        user.setCreatedAt(LocalDateTime.now());
        user.setIsActive(true);
        return user;
    }
}
