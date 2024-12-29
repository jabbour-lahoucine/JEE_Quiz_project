package com.exam.model.exam;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuizResultResponseTest {

    @Test
    void testDefaultConstructor() {
        QuizResultResponse response = new QuizResultResponse();
        assertNotNull(response);
        assertNull(response.getCorrectAnswers());
        assertEquals(0.0, response.getMarksObtained());
        assertNull(response.getAttempted());
        // Ensure questions is not null
        assertNotNull(response.getQuestions());
        assertTrue(response.getQuestions().isEmpty());
    }

    @Test
    void testParameterizedConstructor() {
        List<Question> questions = new ArrayList<>();
        QuizResultResponse response = new QuizResultResponse(10, 95.0, 12, questions);

        assertEquals(10, response.getCorrectAnswers());
        assertEquals(95.0, response.getMarksObtained());
        assertEquals(12, response.getAttempted());
        assertEquals(questions, response.getQuestions());
    }

    @Test
    void testGettersAndSetters() {
        QuizResultResponse response = new QuizResultResponse();

        response.setCorrectAnswers(10);
        assertEquals(10, response.getCorrectAnswers());

        response.setMarksObtained(95.0);
        assertEquals(95.0, response.getMarksObtained());

        response.setAttempted(12);
        assertEquals(12, response.getAttempted());

        List<Question> questions = new ArrayList<>();
        response.setQuestions(questions);
        assertEquals(questions, response.getQuestions());
    }
}