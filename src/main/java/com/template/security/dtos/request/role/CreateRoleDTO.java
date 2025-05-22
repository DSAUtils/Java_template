package com.template.security.dtos.request.role;

import com.template.security.enums.ERole;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CreateRoleDTO {
    @Schema(example = "ADMIN", description = "Role name")
    private ERole name;
}
