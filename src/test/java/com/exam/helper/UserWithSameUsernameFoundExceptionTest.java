package com.exam.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserWithSameUsernameFoundExceptionTest {

    @Test
    void testUserWithSameUsernameFoundExceptionMessage() {
        String username = "testUser";
        UserWithSameUsernameFoundException exception = new UserWithSameUsernameFoundException(username);

        // Verify that the exception message is as expected
        assertEquals("User with id 'testUser' is already exist try with different username!!", exception.getMessage());
    }
}