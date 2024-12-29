package com.exam.model.exam;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    @Test
    void testDefaultConstructor() {
        Category category = new Category();
        assertNotNull(category);
        assertNull(category.getCid());
        assertNull(category.getTitle());
        assertNull(category.getDescription());
        assertNotNull(category.getQuizzes());
        assertTrue(category.getQuizzes().isEmpty());
    }

    @Test
    void testParameterizedConstructor() {
        Set<Quiz> quizzes = new LinkedHashSet<>();
        Category category = new Category("Test Category", "Description");

        assertEquals("Test Category", category.getTitle());
        assertEquals("Description", category.getDescription());
        assertNotNull(category.getQuizzes());
    }

    @Test
    void testGettersAndSetters() {
        Category category = new Category();

        category.setCid(1L);
        assertEquals(1L, category.getCid());

        category.setTitle("Test Category");
        assertEquals("Test Category", category.getTitle());

        category.setDescription("Description");
        assertEquals("Description", category.getDescription());

        Set<Quiz> quizzes = new LinkedHashSet<>();
        category.setQuizzes(quizzes);
        assertEquals(quizzes, category.getQuizzes());
    }
}