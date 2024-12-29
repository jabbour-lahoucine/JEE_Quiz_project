package com.exam.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRoleTest {

    @Test
    void testDefaultConstructor() {
        UserRole userRole = new UserRole();
        assertNotNull(userRole);
        assertEquals(0, userRole.getUserRoleId());
        assertNull(userRole.getUser());
        assertNull(userRole.getRole());
    }

    @Test
    void testGettersAndSetters() {
        UserRole userRole = new UserRole();

        userRole.setUserRoleId(1L);
        assertEquals(1L, userRole.getUserRoleId());

        User user = new User();
        userRole.setUser(user);
        assertEquals(user, userRole.getUser());

        Role role = new Role();
        userRole.setRole(role);
        assertEquals(role, userRole.getRole());
    }
}