package com.exam.model.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizQuestionsTest {

    @Test
    void testDefaultConstructor() {
        QuizQuestions quizQuestions = new QuizQuestions();
        assertNotNull(quizQuestions);
        assertNull(quizQuestions.getQuesId());
        assertNull(quizQuestions.getContent());
        assertNull(quizQuestions.getOption1());
        assertNull(quizQuestions.getOption2());
        assertNull(quizQuestions.getOption3());
        assertNull(quizQuestions.getOption4());
        assertNull(quizQuestions.getAnswer());
        assertNull(quizQuestions.getQuizId());
        assertNull(quizQuestions.getGivenAnswer());
    }

    @Test
    void testParameterizedConstructor() {
        AttemptedQuiz attemptedQuiz = new AttemptedQuiz();
        QuizQuestions quizQuestions = new QuizQuestions(1L, "Content", "Option1", "Option2", "Option3", "Option4", "Answer", 1L, "GivenAnswer");

        assertEquals(1L, quizQuestions.getQuesId());
        assertEquals("Content", quizQuestions.getContent());
        assertEquals("Option1", quizQuestions.getOption1());
        assertEquals("Option2", quizQuestions.getOption2());
        assertEquals("Option3", quizQuestions.getOption3());
        assertEquals("Option4", quizQuestions.getOption4());
        assertEquals("Answer", quizQuestions.getAnswer());
        assertEquals(1L, quizQuestions.getQuizId());
        assertEquals("GivenAnswer", quizQuestions.getGivenAnswer());
    }

    @Test
    void testGettersAndSetters() {
        QuizQuestions quizQuestions = new QuizQuestions();

        quizQuestions.setQuesId(1L);
        assertEquals(1L, quizQuestions.getQuesId());

        quizQuestions.setContent("Content");
        assertEquals("Content", quizQuestions.getContent());

        quizQuestions.setOption1("Option1");
        assertEquals("Option1", quizQuestions.getOption1());

        quizQuestions.setOption2("Option2");
        assertEquals("Option2", quizQuestions.getOption2());

        quizQuestions.setOption3("Option3");
        assertEquals("Option3", quizQuestions.getOption3());

        quizQuestions.setOption4("Option4");
        assertEquals("Option4", quizQuestions.getOption4());

        quizQuestions.setAnswer("Answer");
        assertEquals("Answer", quizQuestions.getAnswer());

        quizQuestions.setQuizId(1L);
        assertEquals(1L, quizQuestions.getQuizId());

        quizQuestions.setGivenAnswer("GivenAnswer");
        assertEquals("GivenAnswer", quizQuestions.getGivenAnswer());
    }
}