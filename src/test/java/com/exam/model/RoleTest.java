package com.exam.model;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {

    @Test
    void testDefaultConstructor() {
        Role role = new Role();
        assertNotNull(role);
        assertNull(role.getRoleId());
        assertNull(role.getRoleName());
        assertNotNull(role.getUserRoles());
        assertTrue(role.getUserRoles().isEmpty());
    }

    @Test
    void testParameterizedConstructor() {
        Set<UserRole> userRoles = new HashSet<>();
        Role role = new Role(1L, "ROLE_USER", userRoles);

        assertEquals(1L, role.getRoleId());
        assertEquals("ROLE_USER", role.getRoleName());
        assertEquals(userRoles, role.getUserRoles());
    }

    @Test
    void testGettersAndSetters() {
        Role role = new Role();

        role.setRoleId(1L);
        assertEquals(1L, role.getRoleId());

        role.setRoleName("ROLE_USER");
        assertEquals("ROLE_USER", role.getRoleName());

        Set<UserRole> userRoles = new HashSet<>();
        role.setUserRoles(userRoles);
        assertEquals(userRoles, role.getUserRoles());
    }
}