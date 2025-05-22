package com.template.security.dtos.request.user;

import com.template.security.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponseDTO {
    private User user;
}