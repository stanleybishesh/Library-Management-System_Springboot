package com.example.lms.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class LoginDTO {
    private String username;
    private String password;
}
