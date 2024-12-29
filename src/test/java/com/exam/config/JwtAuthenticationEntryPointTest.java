package com.exam.config;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.security.core.AuthenticationException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.mockito.Mockito.*;

class JwtAuthenticationEntryPointTest {

    @Test
    void testCommence() throws IOException, ServletException {
        // Arrange
        JwtAuthenticationEntryPoint entryPoint = new JwtAuthenticationEntryPoint();
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        AuthenticationException exception = Mockito.mock(AuthenticationException.class);

        // Act
        entryPoint.commence(request, response, exception);

        // Assert
        verify(response, times(1)).sendError(HttpServletResponse.SC_UNAUTHORIZED, "user is unautherised");
    }
}