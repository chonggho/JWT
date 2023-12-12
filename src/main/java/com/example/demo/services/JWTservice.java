package com.example.demo.services;

import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTservice {

    String extractUserName(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenVaild(String token, UserDetails userDetails);

    String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);
}
