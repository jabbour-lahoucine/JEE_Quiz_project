package com.exam.model.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @Test
    void testDefaultConstructor() {
        Question question = new Question();
        assertNotNull(question);
        assertNull(question.getQuesId());
        assertNull(question.getContent());
        assertNull(question.getOption1());
        assertNull(question.getOption2());
        assertNull(question.getOption3());
        assertNull(question.getOption4());
        assertEquals("default.png", question.getImage());
        assertNull(question.getAnswer());
        assertNull(question.getGivenAnswer());
        assertNull(question.getQuiz());
    }

    @Test
    void testParameterizedConstructor() {
        Quiz quiz = new Quiz();
        Question question = new Question(1L, "Content", "Option1", "Option2", "Option3", "Option4", "Image", "Answer", quiz);

        assertEquals(1L, question.getQuesId());
        assertEquals("Content", question.getContent());
        assertEquals("Option1", question.getOption1());
        assertEquals("Option2", question.getOption2());
        assertEquals("Option3", question.getOption3());
        assertEquals("Option4", question.getOption4());
        assertEquals("Image", question.getImage());
        assertEquals("Answer", question.getAnswer());
        assertEquals(quiz, question.getQuiz());
    }

    @Test
    void testGettersAndSetters() {
        Question question = new Question();

        question.setQuesId(1L);
        assertEquals(1L, question.getQuesId());

        question.setContent("Content");
        assertEquals("Content", question.getContent());

        question.setOption1("Option1");
        assertEquals("Option1", question.getOption1());

        question.setOption2("Option2");
        assertEquals("Option2", question.getOption2());

        question.setOption3("Option3");
        assertEquals("Option3", question.getOption3());

        question.setOption4("Option4");
        assertEquals("Option4", question.getOption4());

        question.setImage("Image");
        assertEquals("Image", question.getImage());

        question.setAnswer("Answer");
        assertEquals("Answer", question.getAnswer());

        Quiz quiz = new Quiz();
        question.setQuiz(quiz);
        assertEquals(quiz, question.getQuiz());
    }
}