package com.template.security.repositories;

import com.template.security.models.Role;
import com.template.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<User, UUID> {
    Optional<User> findUserByEmail(String email);

    Optional<User> findByRoles(Set<Role> roles);

    Optional<User> findByVerificationCode(String verificationCode);
}
