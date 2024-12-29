package com.exam.services.impl;

import com.exam.model.exam.Category;
import com.exam.model.exam.Quiz;
import com.exam.repository.QuizRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class QuizServiceImplTest {

    @Mock
    private QuizRepository quizRepository;

    @InjectMocks
    private QuizServiceImpl quizService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddQuiz() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.addQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testAddQuiz2() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.addQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testAddQuiz3() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.addQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testAddQuiz4() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.addQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testAddQuiz5() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.addQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testUpdateQuiz() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.updateQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testUpdateQuiz2() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.updateQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testUpdateQuiz3() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.updateQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testUpdateQuiz4() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.updateQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testUpdateQuiz5() {
        Quiz quiz = new Quiz();
        when(quizRepository.save(quiz)).thenReturn(quiz);

        Quiz result = quizService.updateQuiz(quiz);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).save(quiz);
    }

    @Test
    public void testGetQuizzes() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findAll()).thenReturn(Arrays.asList(quiz1, quiz2));

        Set<Quiz> result = quizService.getQuizzes();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuizzes2() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findAll()).thenReturn(Arrays.asList(quiz1, quiz2));

        Set<Quiz> result = quizService.getQuizzes();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuizzes3() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findAll()).thenReturn(Arrays.asList(quiz1, quiz2));

        Set<Quiz> result = quizService.getQuizzes();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuizzes4() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findAll()).thenReturn(Arrays.asList(quiz1, quiz2));

        Set<Quiz> result = quizService.getQuizzes();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuizzes5() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findAll()).thenReturn(Arrays.asList(quiz1, quiz2));

        Set<Quiz> result = quizService.getQuizzes();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuizById_QuizExists() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));

        Quiz result = quizService.getQuizById(1L);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizExists2() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));

        Quiz result = quizService.getQuizById(1L);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizExists3() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));

        Quiz result = quizService.getQuizById(1L);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizExists4() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));

        Quiz result = quizService.getQuizById(1L);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizExists5() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));

        Quiz result = quizService.getQuizById(1L);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizNotFound() {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.getQuizById(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizNotFound2() {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.getQuizById(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizNotFound3() {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.getQuizById(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizNotFound4() {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.getQuizById(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuizById_QuizNotFound5() {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.getQuizById(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizExists() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));
        doNothing().when(quizRepository).deleteById(1L);

        quizService.deleteQuiz(1L);

        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizExists2() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));
        doNothing().when(quizRepository).deleteById(1L);

        quizService.deleteQuiz(1L);

        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizExists3() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));
        doNothing().when(quizRepository).deleteById(1L);

        quizService.deleteQuiz(1L);

        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizExists4() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));
        doNothing().when(quizRepository).deleteById(1L);

        quizService.deleteQuiz(1L);

        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizExists5() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));
        doNothing().when(quizRepository).deleteById(1L);

        quizService.deleteQuiz(1L);

        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizNotFound() throws Exception {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.deleteQuiz(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizNotFound2() throws Exception {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.deleteQuiz(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizNotFound3() throws Exception {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.deleteQuiz(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizNotFound4() throws Exception {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.deleteQuiz(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuiz_QuizNotFound5() throws Exception {
        when(quizRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            quizService.deleteQuiz(1L);
        });

        assertEquals("Quiz not found exception", exception.getMessage());
        verify(quizRepository, times(1)).findById(1L);
        verify(quizRepository, never()).deleteById(1L);
    }

    @Test
    public void testFindQuizzesByCategoryId() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        List<Quiz> quizzes = Arrays.asList(quiz1, quiz2);

        when(quizRepository.findQuizzesByCategory(category)).thenReturn(quizzes);

        List<Quiz> result = quizService.findQuizzesByCategoryId(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findQuizzesByCategory(category);
    }

    @Test
    public void testFindQuizzesByCategoryId2() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        List<Quiz> quizzes = Arrays.asList(quiz1, quiz2);

        when(quizRepository.findQuizzesByCategory(category)).thenReturn(quizzes);

        List<Quiz> result = quizService.findQuizzesByCategoryId(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findQuizzesByCategory(category);
    }

    @Test
    public void testFindQuizzesByCategoryId3() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        List<Quiz> quizzes = Arrays.asList(quiz1, quiz2);

        when(quizRepository.findQuizzesByCategory(category)).thenReturn(quizzes);

        List<Quiz> result = quizService.findQuizzesByCategoryId(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findQuizzesByCategory(category);
    }

    @Test
    public void testFindQuizzesByCategoryId4() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        List<Quiz> quizzes = Arrays.asList(quiz1, quiz2);

        when(quizRepository.findQuizzesByCategory(category)).thenReturn(quizzes);

        List<Quiz> result = quizService.findQuizzesByCategoryId(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findQuizzesByCategory(category);
    }

    @Test
    public void testFindQuizzesByCategoryId5() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        List<Quiz> quizzes = Arrays.asList(quiz1, quiz2);

        when(quizRepository.findQuizzesByCategory(category)).thenReturn(quizzes);

        List<Quiz> result = quizService.findQuizzesByCategoryId(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findQuizzesByCategory(category);
    }

    @Test
    public void testFindAllActiveQuiz() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByActive(true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuiz();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByActive(true);
    }

    @Test
    public void testFindAllActiveQuiz2() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByActive(true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuiz();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByActive(true);
    }

    @Test
    public void testFindAllActiveQuiz3() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByActive(true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuiz();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByActive(true);
    }

    @Test
    public void testFindAllActiveQuiz4() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByActive(true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuiz();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByActive(true);
    }

    @Test
    public void testFindAllActiveQuiz5() {
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByActive(true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuiz();

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByActive(true);
    }

    @Test
    public void testFindAllActiveQuizOfCategory() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByCategoryAndActive(category, true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuizOfCategory(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByCategoryAndActive(category, true);
    }

    @Test
    public void testFindAllActiveQuizOfCategory2() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByCategoryAndActive(category, true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuizOfCategory(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByCategoryAndActive(category, true);
    }

    @Test
    public void testFindAllActiveQuizOfCategory3() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByCategoryAndActive(category, true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuizOfCategory(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByCategoryAndActive(category, true);
    }

    @Test
    public void testFindAllActiveQuizOfCategory4() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByCategoryAndActive(category, true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuizOfCategory(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByCategoryAndActive(category, true);
    }

    @Test
    public void testFindAllActiveQuizOfCategory5() {
        Category category = new Category();
        Quiz quiz1 = new Quiz();
        Quiz quiz2 = new Quiz();
        when(quizRepository.findByCategoryAndActive(category, true)).thenReturn(Arrays.asList(quiz1, quiz2));

        List<Quiz> result = quizService.findAllActiveQuizOfCategory(category);

        assertEquals(2, result.size());
        verify(quizRepository, times(1)).findByCategoryAndActive(category, true);
    }

    @Test
    public void testGetQuizById_QuizExists1() throws Exception {
        Quiz quiz = new Quiz();
        when(quizRepository.findById(1L)).thenReturn(Optional.of(quiz));

        Quiz result = quizService.getQuizById(1L);

        assertEquals(quiz, result);
        verify(quizRepository, times(1)).findById(1L);
    }
}