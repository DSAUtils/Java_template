package com.template.security.services;

import com.template.security.dtos.request.role.CreateRoleDTO;
import com.template.security.dtos.response.role.RoleResponseDTO;
import com.template.security.dtos.response.role.RolesResponseDTO;
import com.template.security.enums.ERole;
import com.template.security.models.Role;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IRoleService {
    public Role getRoleById(UUID roleId);

    public Role getRoleByName(ERole roleName);

    public void createRole(ERole roleName);

    public RoleResponseDTO createRole(CreateRoleDTO createRoleDTO);

    public RolesResponseDTO getRoles(Pageable pageable);

    public void deleteRole(UUID roleId);

    public boolean isRolePresent(ERole roleName);
}