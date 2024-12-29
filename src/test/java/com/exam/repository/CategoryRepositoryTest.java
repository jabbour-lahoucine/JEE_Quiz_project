package com.exam.repository;

import com.exam.model.exam.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void testSaveAndFindById() {
        Category category = new Category();
        category.setTitle("Test Category");

        Category savedCategory = categoryRepository.save(category);
        Optional<Category> retrievedCategory = categoryRepository.findById(savedCategory.getCid());

        assertTrue(retrievedCategory.isPresent());
        assertEquals("Test Category", retrievedCategory.get().getTitle());
    }
}