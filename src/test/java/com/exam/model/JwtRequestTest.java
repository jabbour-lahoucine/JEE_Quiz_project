package com.exam.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtRequestTest {

    @Test
    void testDefaultConstructor() {
        JwtRequest jwtRequest = new JwtRequest();
        assertNotNull(jwtRequest);
        assertNull(jwtRequest.getUsername());
        assertNull(jwtRequest.getPassword());
    }

    @Test
    void testParameterizedConstructor() {
        JwtRequest jwtRequest = new JwtRequest("testUser", "testPassword");

        assertEquals("testUser", jwtRequest.getUsername());
        assertEquals("testPassword", jwtRequest.getPassword());
    }

    @Test
    void testGettersAndSetters() {
        JwtRequest jwtRequest = new JwtRequest();

        jwtRequest.setUsername("testUser");
        assertEquals("testUser", jwtRequest.getUsername());

        jwtRequest.setPassword("testPassword");
        assertEquals("testPassword", jwtRequest.getPassword());
    }

    @Test
    void testToString() {
        JwtRequest jwtRequest = new JwtRequest("testUser", "testPassword");
        String expected = "JwtRequest [username=testUser, password=testPassword]";
        assertEquals(expected, jwtRequest.toString());
    }
}