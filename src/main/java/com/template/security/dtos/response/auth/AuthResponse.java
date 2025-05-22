package com.template.security.dtos.response.auth;

import com.template.security.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthResponse {
    private String token;
    private User user;

    public AuthResponse(String token, User user) {
        this.token = token;
        this.user = user;
    }
}
