package com.exam.repository;

import com.exam.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByUsername() {
        User user = new User();
        user.setUsername("testUser");
        userRepository.save(user);

        User retrievedUser = userRepository.findByUsername("testUser");

        assertNotNull(retrievedUser);
        assertEquals("testUser", retrievedUser.getUsername());
    }
}