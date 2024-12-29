package com.exam.services.impl;

import com.exam.model.exam.Category;
import com.exam.repository.CategoryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CategoryServiceImplTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryServiceImpl categoryService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddCategory() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.addCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testAddCategory2() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.addCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testAddCategory3() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.addCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testAddCategory4() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.addCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testAddCategory5() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.addCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testUpdateCategory() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.updateCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testUpdateCategory2() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.updateCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testUpdateCategory3() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.updateCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testUpdateCategory4() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.updateCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testUpdateCategory5() {
        Category category = new Category();
        when(categoryRepository.save(category)).thenReturn(category);

        Category result = categoryService.updateCategory(category);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).save(category);
    }

    @Test
    public void testGetCategories() {
        Category category1 = new Category();
        Category category2 = new Category();
        when(categoryRepository.findAll()).thenReturn(Arrays.asList(category1, category2));

        Set<Category> result = categoryService.getCategories();

        assertEquals(2, result.size());
        verify(categoryRepository, times(1)).findAll();
    }

    @Test
    public void testGetCategories2() {
        Category category1 = new Category();
        Category category2 = new Category();
        when(categoryRepository.findAll()).thenReturn(Arrays.asList(category1, category2));

        Set<Category> result = categoryService.getCategories();

        assertEquals(2, result.size());
        verify(categoryRepository, times(1)).findAll();
    }

    @Test
    public void testGetCategories3() {
        Category category1 = new Category();
        Category category2 = new Category();
        when(categoryRepository.findAll()).thenReturn(Arrays.asList(category1, category2));

        Set<Category> result = categoryService.getCategories();

        assertEquals(2, result.size());
        verify(categoryRepository, times(1)).findAll();
    }

    @Test
    public void testGetCategories4() {
        Category category1 = new Category();
        Category category2 = new Category();
        when(categoryRepository.findAll()).thenReturn(Arrays.asList(category1, category2));

        Set<Category> result = categoryService.getCategories();

        assertEquals(2, result.size());
        verify(categoryRepository, times(1)).findAll();
    }

    @Test
    public void testGetCategories5() {
        Category category1 = new Category();
        Category category2 = new Category();
        when(categoryRepository.findAll()).thenReturn(Arrays.asList(category1, category2));

        Set<Category> result = categoryService.getCategories();

        assertEquals(2, result.size());
        verify(categoryRepository, times(1)).findAll();
    }

    @Test
    public void testDeleteCategory() throws Exception {
        Long categoryId = 1L;
        doNothing().when(categoryRepository).deleteById(categoryId);

        categoryService.deleteCategory(categoryId);

        verify(categoryRepository, times(1)).deleteById(categoryId);
    }

    @Test
    public void testDeleteCategory2() throws Exception {
        Long categoryId = 1L;
        doNothing().when(categoryRepository).deleteById(categoryId);

        categoryService.deleteCategory(categoryId);

        verify(categoryRepository, times(1)).deleteById(categoryId);
    }

    @Test
    public void testDeleteCategory3() throws Exception {
        Long categoryId = 1L;
        doNothing().when(categoryRepository).deleteById(categoryId);

        categoryService.deleteCategory(categoryId);

        verify(categoryRepository, times(1)).deleteById(categoryId);
    }

    @Test
    public void testDeleteCategory4() throws Exception {
        Long categoryId = 1L;
        doNothing().when(categoryRepository).deleteById(categoryId);

        categoryService.deleteCategory(categoryId);

        verify(categoryRepository, times(1)).deleteById(categoryId);
    }

    @Test
    public void testDeleteCategory5() throws Exception {
        Long categoryId = 1L;
        doNothing().when(categoryRepository).deleteById(categoryId);

        categoryService.deleteCategory(categoryId);

        verify(categoryRepository, times(1)).deleteById(categoryId);
    }

    @Test
    public void testGetCategoryById_CategoryExists() throws Exception {
        Category category = new Category();
        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));

        Category result = categoryService.getCategoryById(1L);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryExists2() throws Exception {
        Category category = new Category();
        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));

        Category result = categoryService.getCategoryById(1L);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryExists3() throws Exception {
        Category category = new Category();
        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));

        Category result = categoryService.getCategoryById(1L);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryExists4() throws Exception {
        Category category = new Category();
        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));

        Category result = categoryService.getCategoryById(1L);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryExists5() throws Exception {
        Category category = new Category();
        when(categoryRepository.findById(1L)).thenReturn(Optional.of(category));

        Category result = categoryService.getCategoryById(1L);

        assertEquals(category, result);
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryNotFound() {
        when(categoryRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            categoryService.getCategoryById(1L);
        });

        assertEquals("No value present", exception.getMessage());
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryNotFound2() {
        when(categoryRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            categoryService.getCategoryById(1L);
        });

        assertEquals("No value present", exception.getMessage());
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryNotFound3() {
        when(categoryRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            categoryService.getCategoryById(1L);
        });

        assertEquals("No value present", exception.getMessage());
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryNotFound4() {
        when(categoryRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            categoryService.getCategoryById(1L);
        });

        assertEquals("No value present", exception.getMessage());
        verify(categoryRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetCategoryById_CategoryNotFound5() {
        when(categoryRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            categoryService.getCategoryById(1L);
        });

        assertEquals("No value present", exception.getMessage());
        verify(categoryRepository, times(1)).findById(1L);
    }
}