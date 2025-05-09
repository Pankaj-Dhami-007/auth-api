package com.neepanklok.controllers;

import com.neepanklok.dtos.RegistrationDTO;
import com.neepanklok.entities.User;
import com.neepanklok.sevices.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<RegistrationDTO> register(@RequestBody RegistrationDTO registrationDTO){
       RegistrationDTO registeredUser = authService.register(registrationDTO);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
}
