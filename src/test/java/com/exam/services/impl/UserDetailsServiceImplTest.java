package com.exam.services.impl;

import com.exam.helper.UserNotFoundException;
import com.exam.model.User;
import com.exam.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserDetailsServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testLoadUserByUsername_UserExists() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        UserDetails userDetails = userDetailsService.loadUserByUsername("existingUser");

        assertEquals("existingUser", userDetails.getUsername());
        verify(userRepository, times(1)).findByUsername("existingUser");
    }

    @Test
    public void testLoadUserByUsername_UserExists2() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        UserDetails userDetails = userDetailsService.loadUserByUsername("existingUser");

        assertEquals("existingUser", userDetails.getUsername());
        verify(userRepository, times(1)).findByUsername("existingUser");
    }

    @Test
    public void testLoadUserByUsername_UserExists3() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        UserDetails userDetails = userDetailsService.loadUserByUsername("existingUser");

        assertEquals("existingUser", userDetails.getUsername());
        verify(userRepository, times(1)).findByUsername("existingUser");
    }

    @Test
    public void testLoadUserByUsername_UserExists4() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        UserDetails userDetails = userDetailsService.loadUserByUsername("existingUser");

        assertEquals("existingUser", userDetails.getUsername());
        verify(userRepository, times(1)).findByUsername("existingUser");
    }

    @Test
    public void testLoadUserByUsername_UserExists5() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        UserDetails userDetails = userDetailsService.loadUserByUsername("existingUser");

        assertEquals("existingUser", userDetails.getUsername());
        verify(userRepository, times(1)).findByUsername("existingUser");
    }

    @Test
    public void testLoadUserByUsername_UserNotFound() {
        when(userRepository.findByUsername("nonExistingUser")).thenReturn(null);

        assertThrows(UsernameNotFoundException.class, () -> {
            userDetailsService.loadUserByUsername("nonExistingUser");
        });

        verify(userRepository, times(1)).findByUsername("nonExistingUser");
    }

    @Test
    public void testLoadUserByUsername_UserNotFound2() {
        when(userRepository.findByUsername("nonExistingUser")).thenReturn(null);

        assertThrows(UsernameNotFoundException.class, () -> {
            userDetailsService.loadUserByUsername("nonExistingUser");
        });

        verify(userRepository, times(1)).findByUsername("nonExistingUser");
    }

    @Test
    public void testLoadUserByUsername_UserNotFound3() {
        when(userRepository.findByUsername("nonExistingUser")).thenReturn(null);

        assertThrows(UsernameNotFoundException.class, () -> {
            userDetailsService.loadUserByUsername("nonExistingUser");
        });

        verify(userRepository, times(1)).findByUsername("nonExistingUser");
    }

    @Test
    public void testLoadUserByUsername_UserNotFound4() {
        when(userRepository.findByUsername("nonExistingUser")).thenReturn(null);

        assertThrows(UsernameNotFoundException.class, () -> {
            userDetailsService.loadUserByUsername("nonExistingUser");
        });

        verify(userRepository, times(1)).findByUsername("nonExistingUser");
    }

    @Test
    public void testLoadUserByUsername_UserNotFound5() {
        when(userRepository.findByUsername("nonExistingUser")).thenReturn(null);

        assertThrows(UsernameNotFoundException.class, () -> {
            userDetailsService.loadUserByUsername("nonExistingUser");
        });

        verify(userRepository, times(1)).findByUsername("nonExistingUser");
    }
}