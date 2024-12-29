package com.exam.config;

import com.exam.services.impl.UserDetailsServiceImpl;
import com.exam.util.JwtUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Field;

import static org.mockito.Mockito.*;

class JwtAuthenticationFilterTest {

    private JwtAuthenticationFilter jwtAuthenticationFilter;
    private UserDetailsServiceImpl userDetailsServiceImpl;
    private JwtUtils jwtUtils;

    @BeforeEach
    void setUp() throws Exception {
        jwtAuthenticationFilter = new JwtAuthenticationFilter();
        userDetailsServiceImpl = Mockito.mock(UserDetailsServiceImpl.class);
        jwtUtils = Mockito.mock(JwtUtils.class);

        setField(jwtAuthenticationFilter, "userDetailsServiceImpl", userDetailsServiceImpl);
        setField(jwtAuthenticationFilter, "jwtUtil", jwtUtils);
    }

    private void setField(Object targetObject, String fieldName, Object fieldValue) throws Exception {
        Field field = targetObject.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(targetObject, fieldValue);
    }

    @Test
    void testDoFilterInternal() throws IOException, ServletException {
        // Arrange
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        FilterChain chain = Mockito.mock(FilterChain.class);

        when(request.getHeader("Authorization")).thenReturn("Bearer token");
        when(jwtUtils.extractUsername("token")).thenReturn("user");
        UserDetails userDetails = Mockito.mock(UserDetails.class);
        when(userDetailsServiceImpl.loadUserByUsername("user")).thenReturn(userDetails);
        when(jwtUtils.validateToken("token", userDetails)).thenReturn(true);

        // Act
        jwtAuthenticationFilter.doFilterInternal(request, response, chain);

        // Assert
        verify(chain, times(1)).doFilter(request, response);
    }
}