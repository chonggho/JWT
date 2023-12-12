package com.example.demo.dto;

import lombok.Data;

@Data
public class SignUpRequest {
    private String username;
    private String nickname;
    private String email;
    private String password;
}
