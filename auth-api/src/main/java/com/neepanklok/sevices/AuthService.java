package com.neepanklok.sevices;

import com.neepanklok.dtos.RegistrationDTO;
import com.neepanklok.entities.Client;
import com.neepanklok.entities.User;
import com.neepanklok.mappers.ModelMapper;

import com.neepanklok.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    public RegistrationDTO register(RegistrationDTO dto){
        if(userRepository.existsByEmail(dto.getEmail())){
            throw new RuntimeException("email already registered...");
        }
        User user = ModelMapper.dtoToUser(dto);
        User savedUser = userRepository.save(user);
        return ModelMapper.userToDto(savedUser);
    }
}
