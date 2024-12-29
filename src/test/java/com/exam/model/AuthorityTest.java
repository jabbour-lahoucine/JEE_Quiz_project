package com.exam.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorityTest {

    @Test
    void testConstructorAndGetters() {
        // Create an Authority object with a specific authority
        Authority authority = new Authority("ROLE_USER");

        // Verify the authority value
        assertEquals("ROLE_USER", authority.getAuthority());
    }

    @Test
    void testGetAuthority() {
        // Create an Authority object with a different authority
        Authority authority = new Authority("ROLE_ADMIN");

        // Verify the getAuthority method
        assertEquals("ROLE_ADMIN", authority.getAuthority());
    }
}