package com.exam.model;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testDefaultConstructor() {
        User user = new User();
        assertNotNull(user);
        assertNull(user.getUserId());
        assertNull(user.getUsername());
        assertNull(user.getEmail());
        assertNull(user.getPassword());
        assertNull(user.getFirstname());
        assertNull(user.getLastname());
        assertNull(user.getPhonenumber());
        assertTrue(user.isEnabled());
        assertNull(user.getProfile());
        assertNotNull(user.getUserRole());
        assertTrue(user.getUserRole().isEmpty());
    }

    @Test
    void testParameterizedConstructor() {
        Set<UserRole> userRoles = new HashSet<>();
        User user = new User("testUser", "testEmail", "testPassword", "testFirstName", "testLastName", "1234567890", true, "default.png", userRoles);

        assertEquals("testUser", user.getUsername());
        assertEquals("testEmail", user.getEmail());
        assertEquals("testPassword", user.getPassword());
        assertEquals("testFirstName", user.getFirstname());
        assertEquals("testLastName", user.getLastname());
        assertEquals("1234567890", user.getPhonenumber());
        assertTrue(user.isEnabled());
        assertEquals("default.png", user.getProfile());
        assertEquals(userRoles, user.getUserRole());
    }

    @Test
    void testGettersAndSetters() {
        User user = new User();

        user.setUserId(1L);
        assertEquals(1L, user.getUserId());

        user.setUsername("testUser");
        assertEquals("testUser", user.getUsername());

        user.setEmail("testEmail");
        assertEquals("testEmail", user.getEmail());

        user.setPassword("testPassword");
        assertEquals("testPassword", user.getPassword());

        user.setFirstname("testFirstName");
        assertEquals("testFirstName", user.getFirstname());

        user.setLastname("testLastName");
        assertEquals("testLastName", user.getLastname());

        user.setPhonenumber("1234567890");
        assertEquals("1234567890", user.getPhonenumber());

        user.setEnabled(true);
        assertTrue(user.isEnabled());

        user.setProfile("default.png");
        assertEquals("default.png", user.getProfile());

        Set<UserRole> userRoles = new HashSet<>();
        user.setUserRole(userRoles);
        assertEquals(userRoles, user.getUserRole());
    }
}