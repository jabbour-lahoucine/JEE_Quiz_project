package com.exam.repository;

import com.exam.model.exam.Category;
import com.exam.model.exam.Quiz;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class QuizRepositoryTest {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void testFindQuizzesByCategory() {
        Category category = new Category();
        category.setTitle("Test Category");
        Category savedCategory = categoryRepository.save(category);

        Quiz quiz = new Quiz();
        quiz.setTitle("Test Quiz");
        quiz.setCategory(savedCategory);
        quizRepository.save(quiz);

        List<Quiz> quizzes = quizRepository.findQuizzesByCategory(savedCategory);

        assertFalse(quizzes.isEmpty());
        assertEquals("Test Quiz", quizzes.get(0).getTitle());
    }
}