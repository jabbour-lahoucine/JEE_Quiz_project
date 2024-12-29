package com.exam.model.exam;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AttemptedQuizTest {

    @Test
    void testDefaultConstructor() {
        AttemptedQuiz attemptedQuiz = new AttemptedQuiz();
        assertNotNull(attemptedQuiz);
        assertNull(attemptedQuiz.getId());
        assertNull(attemptedQuiz.getUsername());
        assertNotNull(attemptedQuiz.getQuestions());
        assertTrue(attemptedQuiz.getQuestions().isEmpty());
    }

    @Test
    void testParameterizedConstructor() {
        Set<QuizQuestions> questions = new LinkedHashSet<>();
        AttemptedQuiz attemptedQuiz = new AttemptedQuiz(1L, "testUser", questions);

        assertEquals(1L, attemptedQuiz.getId());
        assertEquals("testUser", attemptedQuiz.getUsername());
        assertEquals(questions, attemptedQuiz.getQuestions());
    }

    @Test
    void testGettersAndSetters() {
        AttemptedQuiz attemptedQuiz = new AttemptedQuiz();

        attemptedQuiz.setId(1L);
        assertEquals(1L, attemptedQuiz.getId());

        attemptedQuiz.setUsername("testUser");
        assertEquals("testUser", attemptedQuiz.getUsername());

        Set<QuizQuestions> questions = new LinkedHashSet<>();
        attemptedQuiz.setQuestions(questions);
        assertEquals(questions, attemptedQuiz.getQuestions());
    }

    @Test
    void testAddQuestion() {
        AttemptedQuiz attemptedQuiz = new AttemptedQuiz();
        QuizQuestions quizQuestion = new QuizQuestions();
        Set<QuizQuestions> questions = new LinkedHashSet<>();
        questions.add(quizQuestion);

        attemptedQuiz.setQuestions(questions);
        assertEquals(1, attemptedQuiz.getQuestions().size());
        assertTrue(attemptedQuiz.getQuestions().contains(quizQuestion));
    }
}