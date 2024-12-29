package com.exam.model.exam;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {

    @Test
    void testDefaultConstructor() {
        Quiz quiz = new Quiz();
        assertNotNull(quiz);
        assertNull(quiz.getQid());
        assertNull(quiz.getTitle());
        assertNull(quiz.getDescription());
        assertNull(quiz.getNumberOfQuestions());
        assertNull(quiz.getMaxMarks());
        assertFalse(quiz.isActive());
        assertNull(quiz.getCategory());
        assertNotNull(quiz.getQuestion());
        assertTrue(quiz.getQuestion().isEmpty());
    }

    @Test
    void testParameterizedConstructor() {
        Category category = new Category();
        Set<Question> questions = new HashSet<>();
        Quiz quiz = new Quiz(1L, "Title", "Description", "10", "100", true, category, questions);

        assertEquals(1L, quiz.getQid());
        assertEquals("Title", quiz.getTitle());
        assertEquals("Description", quiz.getDescription());
        assertEquals("10", quiz.getNumberOfQuestions());
        assertEquals("100", quiz.getMaxMarks());
        assertTrue(quiz.isActive());
        assertEquals(category, quiz.getCategory());
        assertEquals(questions, quiz.getQuestion());
    }

    @Test
    void testGettersAndSetters() {
        Quiz quiz = new Quiz();

        quiz.setQid(1L);
        assertEquals(1L, quiz.getQid());

        quiz.setTitle("Title");
        assertEquals("Title", quiz.getTitle());

        quiz.setDescription("Description");
        assertEquals("Description", quiz.getDescription());

        quiz.setNumberOfQuestions("10");
        assertEquals("10", quiz.getNumberOfQuestions());

        quiz.setMaxMarks("100");
        assertEquals("100", quiz.getMaxMarks());

        quiz.setActive(true);
        assertTrue(quiz.isActive());

        Category category = new Category();
        quiz.setCategory(category);
        assertEquals(category, quiz.getCategory());

        Set<Question> questions = new HashSet<>();
        quiz.setQuestion(questions);
        assertEquals(questions, quiz.getQuestion());
    }
}