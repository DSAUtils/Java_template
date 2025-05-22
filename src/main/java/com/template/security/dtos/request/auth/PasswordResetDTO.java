package com.template.security.dtos.request.auth;

import com.template.security.annotations.ValidPassword;
import lombok.Data;

@Data
public class PasswordResetDTO {
    private String email;
    private String resetCode;

    @ValidPassword(message = "Password should be strong")
    private String newPassword;
}