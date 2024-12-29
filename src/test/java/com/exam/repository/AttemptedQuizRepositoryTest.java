package com.exam.repository;

import com.exam.model.exam.AttemptedQuiz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class AttemptedQuizRepositoryTest {

    @Autowired
    private AttemptedQuizRepository attemptedQuizRepository;

    @Test
    void testSaveAndFindById() {
        // Create a new AttemptedQuiz object
        AttemptedQuiz quiz = new AttemptedQuiz();
        quiz.setUsername("testUser");

        // Save the AttemptedQuiz object to the repository
        AttemptedQuiz savedQuiz = attemptedQuizRepository.save(quiz);

        // Retrieve the AttemptedQuiz object by its ID
        Optional<AttemptedQuiz> retrievedQuiz = attemptedQuizRepository.findById(savedQuiz.getId());

        // Verify that the retrieved object is present and has the expected username
        assertTrue(retrievedQuiz.isPresent());
        assertEquals("testUser", retrievedQuiz.get().getUsername());
    }
}