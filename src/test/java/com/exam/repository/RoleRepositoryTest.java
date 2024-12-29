package com.exam.repository;

import com.exam.model.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    void testSaveAndFindById() {
        Role role = new Role();
        role.setRoleName("ROLE_USER");

        Role savedRole = roleRepository.save(role);
        Optional<Role> retrievedRole = roleRepository.findById(savedRole.getRoleId());

        assertTrue(retrievedRole.isPresent());
        assertEquals("ROLE_USER", retrievedRole.get().getRoleName());
    }
}