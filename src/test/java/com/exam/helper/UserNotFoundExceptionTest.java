package com.exam.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserNotFoundExceptionTest {

    @Test
    void testUserNotFoundExceptionMessage() {
        String username = "testUser";
        UserNotFoundException exception = new UserNotFoundException(username);

        // Verify that the exception message is as expected
        assertEquals("User with id 'testUser' is not found", exception.getMessage());
    }
}