package com.exam.services.impl;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repository.RoleRepository;
import com.exam.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private RoleRepository roleRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCreateUser_UserAlreadyExists() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();

        Exception exception = assertThrows(Exception.class, () -> {
            userService.createUser(user, userRoles);
        });

        assertEquals("this username already exist try again", exception.getMessage());
        verify(userRepository, never()).save(any(User.class));
    }

    @Test
    public void testCreateUser_UserAlreadyExists2() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();

        Exception exception = assertThrows(Exception.class, () -> {
            userService.createUser(user, userRoles);
        });

        assertEquals("this username already exist try again", exception.getMessage());
        verify(userRepository, never()).save(any(User.class));
    }

    @Test
    public void testCreateUser_UserAlreadyExists3() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();

        Exception exception = assertThrows(Exception.class, () -> {
            userService.createUser(user, userRoles);
        });

        assertEquals("this username already exist try again", exception.getMessage());
        verify(userRepository, never()).save(any(User.class));
    }

    @Test
    public void testCreateUser_UserAlreadyExists4() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();

        Exception exception = assertThrows(Exception.class, () -> {
            userService.createUser(user, userRoles);
        });

        assertEquals("this username already exist try again", exception.getMessage());
        verify(userRepository, never()).save(any(User.class));
    }

    @Test
    public void testCreateUser_UserAlreadyExists5() {
        User user = new User();
        user.setUsername("existingUser");

        when(userRepository.findByUsername("existingUser")).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();

        Exception exception = assertThrows(Exception.class, () -> {
            userService.createUser(user, userRoles);
        });

        assertEquals("this username already exist try again", exception.getMessage());
        verify(userRepository, never()).save(any(User.class));
    }

    @Test
    public void testCreateUser_NewUser() throws Exception {
        User user = new User();
        user.setUsername("newUser");

        when(userRepository.findByUsername("newUser")).thenReturn(null);
        when(userRepository.save(user)).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRoles.add(userRole);

        User result = userService.createUser(user, userRoles);

        assertEquals(user, result);
        verify(roleRepository, times(1)).save(userRole.getRole());
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void testCreateUser_NewUser2() throws Exception {
        User user = new User();
        user.setUsername("newUser");

        when(userRepository.findByUsername("newUser")).thenReturn(null);
        when(userRepository.save(user)).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRoles.add(userRole);

        User result = userService.createUser(user, userRoles);

        assertEquals(user, result);
        verify(roleRepository, times(1)).save(userRole.getRole());
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void testCreateUser_NewUser3() throws Exception {
        User user = new User();
        user.setUsername("newUser");

        when(userRepository.findByUsername("newUser")).thenReturn(null);
        when(userRepository.save(user)).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRoles.add(userRole);

        User result = userService.createUser(user, userRoles);

        assertEquals(user, result);
        verify(roleRepository, times(1)).save(userRole.getRole());
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void testCreateUser_NewUser4() throws Exception {
        User user = new User();
        user.setUsername("newUser");

        when(userRepository.findByUsername("newUser")).thenReturn(null);
        when(userRepository.save(user)).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRoles.add(userRole);

        User result = userService.createUser(user, userRoles);

        assertEquals(user, result);
        verify(roleRepository, times(1)).save(userRole.getRole());
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void testCreateUser_NewUser5() throws Exception {
        User user = new User();
        user.setUsername("newUser");

        when(userRepository.findByUsername("newUser")).thenReturn(null);
        when(userRepository.save(user)).thenReturn(user);

        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRoles.add(userRole);

        User result = userService.createUser(user, userRoles);

        assertEquals(user, result);
        verify(roleRepository, times(1)).save(userRole.getRole());
        verify(userRepository, times(1)).save(user);
    }

    @Test
    public void testFindUser() {
        User user = new User();
        user.setUsername("testUser");

        when(userRepository.findByUsername("testUser")).thenReturn(user);

        User result = userService.findUser("testUser");

        assertEquals("testUser", result.getUsername());
        verify(userRepository, times(1)).findByUsername("testUser");
    }

    @Test
    public void testFindUser2() {
        User user = new User();
        user.setUsername("testUser");

        when(userRepository.findByUsername("testUser")).thenReturn(user);

        User result = userService.findUser("testUser");

        assertEquals("testUser", result.getUsername());
        verify(userRepository, times(1)).findByUsername("testUser");
    }

    @Test
    public void testFindUser3() {
        User user = new User();
        user.setUsername("testUser");

        when(userRepository.findByUsername("testUser")).thenReturn(user);

        User result = userService.findUser("testUser");

        assertEquals("testUser", result.getUsername());
        verify(userRepository, times(1)).findByUsername("testUser");
    }

    @Test
    public void testFindUser4() {
        User user = new User();
        user.setUsername("testUser");

        when(userRepository.findByUsername("testUser")).thenReturn(user);

        User result = userService.findUser("testUser");

        assertEquals("testUser", result.getUsername());
        verify(userRepository, times(1)).findByUsername("testUser");
    }

    @Test
    public void testFindUser5() {
        User user = new User();
        user.setUsername("testUser");

        when(userRepository.findByUsername("testUser")).thenReturn(user);

        User result = userService.findUser("testUser");

        assertEquals("testUser", result.getUsername());
        verify(userRepository, times(1)).findByUsername("testUser");
    }

    @Test
    public void testDeleteUser() {
        Long userId = 1L;

        doNothing().when(userRepository).deleteById(userId);

        userService.deleteUser(userId);

        verify(userRepository, times(1)).deleteById(userId);
    }

    @Test
    public void testDeleteUser2() {
        Long userId = 1L;

        doNothing().when(userRepository).deleteById(userId);

        userService.deleteUser(userId);

        verify(userRepository, times(1)).deleteById(userId);
    }

    @Test
    public void testDeleteUser3() {
        Long userId = 1L;

        doNothing().when(userRepository).deleteById(userId);

        userService.deleteUser(userId);

        verify(userRepository, times(1)).deleteById(userId);
    }

    @Test
    public void testDeleteUser4() {
        Long userId = 1L;

        doNothing().when(userRepository).deleteById(userId);

        userService.deleteUser(userId);

        verify(userRepository, times(1)).deleteById(userId);
    }

    @Test
    public void testDeleteUser5() {
        Long userId = 1L;

        doNothing().when(userRepository).deleteById(userId);

        userService.deleteUser(userId);

        verify(userRepository, times(1)).deleteById(userId);
    }
}