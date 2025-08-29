package com.example.lms.service;

import com.example.lms.dto.LoginRequest;
import com.example.lms.dto.RegisterRequest;
import com.example.lms.dto.JwtResponse;
import com.example.lms.model.Role;
import com.example.lms.model.User;
import com.example.lms.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;

    @Transactional
    public User register(RegisterRequest req) {
        if (userRepository.existsByUsername(req.username()) || userRepository.existsByEmail(req.email())) {
            throw new RuntimeException("Username or email already exists");
        }
        User user = User.builder()
                .username(req.username())
                .email(req.email())
                .password(req.password()) // TODO: encode password (BCrypt)
                .role(Role.valueOf(req.role()))
                .build();
        return userRepository.save(user);
    }

    public JwtResponse login(LoginRequest req) {
        // Dummy login for starter (no password check). Replace with proper auth + JWT later.
        return new JwtResponse("dummy-token");
    }
}
