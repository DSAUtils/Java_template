package com.template.security.services;


import com.template.security.dtos.request.auth.UpdateUserDTO;
import com.template.security.dtos.request.user.CreateAdminDTO;
import com.template.security.dtos.request.user.UserResponseDTO;
import com.template.security.dtos.request.user.UserRoleModificationDTO;
import com.template.security.models.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {

    User findUserById(UUID userId);

    User getLoggedInUser();

    UserResponseDTO createAdmin(CreateAdminDTO createUserDTO);

    List<User> getUsers();

    UserResponseDTO getUserById(UUID uuid);

    UserResponseDTO updateUser(UUID userId, UpdateUserDTO updateUserDTO);

    UserResponseDTO addRoles(UUID userId, UserRoleModificationDTO userRoleModificationDTO);

    UserResponseDTO removeRoles(UUID userId, UserRoleModificationDTO userRoleModificationDTO);

    void deleteUser(UUID userId);
}
