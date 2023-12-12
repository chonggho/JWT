package com.example.demo.dto;

import lombok.Data;

// jwd 인증 응답
@Data
public class JwtAuthenticationResponse {
    private String token;
    private String refreshToken;
}
