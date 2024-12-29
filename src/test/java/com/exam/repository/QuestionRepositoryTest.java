package com.exam.repository;

import com.exam.model.exam.Question;
import com.exam.model.exam.Quiz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class QuestionRepositoryTest {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuizRepository quizRepository;

    @Test
    void testFindByQuiz() {
        Quiz quiz = new Quiz();
        quiz.setTitle("Test Quiz");
        Quiz savedQuiz = quizRepository.save(quiz);

        Question question = new Question();
        question.setContent("Test Question");
        question.setQuiz(savedQuiz);
        questionRepository.save(question);

        Set<Question> questions = questionRepository.findByQuiz(savedQuiz);

        assertFalse(questions.isEmpty());
        assertEquals("Test Question", questions.iterator().next().getContent());
    }
}