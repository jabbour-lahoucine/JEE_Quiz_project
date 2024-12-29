package com.exam.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtResponseTest {

    @Test
    void testDefaultConstructor() {
        JwtResponse jwtResponse = new JwtResponse(null);
        assertNotNull(jwtResponse);
        assertNull(jwtResponse.getToken());
    }

    @Test
    void testParameterizedConstructor() {
        JwtResponse jwtResponse = new JwtResponse("testToken");

        assertEquals("testToken", jwtResponse.getToken());
    }

    @Test
    void testGettersAndSetters() {
        JwtResponse jwtResponse = new JwtResponse(null);

        jwtResponse.setToken("testToken");
        assertEquals("testToken", jwtResponse.getToken());
    }
}