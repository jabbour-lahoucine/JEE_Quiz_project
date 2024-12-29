package com.exam.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class JwtUtilsTest {

    @InjectMocks
    private JwtUtils jwtUtils;

    @Mock
    private UserDetails userDetails;

    private String secret = "testSecret";
    private String token;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);

        // Use reflection to set the private field 'secret'
        Field secretField = JwtUtils.class.getDeclaredField("secret");
        secretField.setAccessible(true);
        secretField.set(jwtUtils, secret);

        token = Jwts.builder()
                .setClaims(new HashMap<>())
                .setSubject("testUser")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour expiration
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();

        when(userDetails.getUsername()).thenReturn("testUser");
    }

    @Test
    void testExtractUsername() {
        String username = jwtUtils.extractUsername(token);
        assertEquals("testUser", username);
    }

    @Test
    void testExtractExpiration() {
        Date expiration = jwtUtils.extractExpiration(token);
        assertTrue(expiration.after(new Date()));
    }

    @Test
    void testGenerateToken() {
        String generatedToken = jwtUtils.generateToken("testUser");
        assertNotNull(generatedToken);
    }

    @Test
    void testValidateToken() {
        boolean isValid = jwtUtils.validateToken(token, userDetails);
        assertTrue(isValid);
    }

    @Test
    void testIsTokenExpired() throws Exception {
        // Use reflection to access the private method 'isTokenExpired'
        Method isTokenExpiredMethod = JwtUtils.class.getDeclaredMethod("isTokenExpired", String.class);
        isTokenExpiredMethod.setAccessible(true);
        boolean isExpired = (boolean) isTokenExpiredMethod.invoke(jwtUtils, token);
        assertFalse(isExpired);
    }
}