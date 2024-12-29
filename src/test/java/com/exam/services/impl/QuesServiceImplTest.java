package com.exam.services.impl;

import com.exam.model.exam.Question;
import com.exam.model.exam.Quiz;
import com.exam.repository.QuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class QuesServiceImplTest {

    @Mock
    private QuestionRepository questionRepository;

    @InjectMocks
    private QuesServiceImpl questionService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAddQuestion() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.addQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testAddQuestion2() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.addQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testAddQuestion3() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.addQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testAddQuestion4() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.addQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testAddQuestion5() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.addQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testUpdateQuestion() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.updateQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testUpdateQuestion2() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.updateQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testUpdateQuestion3() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.updateQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testUpdateQuestion4() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.updateQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testUpdateQuestion5() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.updateQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testGetQuestions() {
        Question question1 = new Question();
        Question question2 = new Question();
        when(questionRepository.findAll()).thenReturn(Arrays.asList(question1, question2));

        Set<Question> result = questionService.getQuestions();

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuestions2() {
        Question question1 = new Question();
        Question question2 = new Question();
        when(questionRepository.findAll()).thenReturn(Arrays.asList(question1, question2));

        Set<Question> result = questionService.getQuestions();

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuestions3() {
        Question question1 = new Question();
        Question question2 = new Question();
        when(questionRepository.findAll()).thenReturn(Arrays.asList(question1, question2));

        Set<Question> result = questionService.getQuestions();

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuestions4() {
        Question question1 = new Question();
        Question question2 = new Question();
        when(questionRepository.findAll()).thenReturn(Arrays.asList(question1, question2));

        Set<Question> result = questionService.getQuestions();

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findAll();
    }

    @Test
    public void testGetQuestions5() {
        Question question1 = new Question();
        Question question2 = new Question();
        when(questionRepository.findAll()).thenReturn(Arrays.asList(question1, question2));

        Set<Question> result = questionService.getQuestions();

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findAll();
    }

    @Test
    public void testQuestionsOfQuiz() {
        Quiz quiz = new Quiz();
        Question question1 = new Question();
        Question question2 = new Question();
        Set<Question> questions = new HashSet<>(Arrays.asList(question1, question2));

        when(questionRepository.findByQuiz(quiz)).thenReturn(questions);

        Set<Question> result = questionService.questionsOfQuiz(quiz);

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findByQuiz(quiz);
    }

    @Test
    public void testQuestionsOfQuiz2() {
        Quiz quiz = new Quiz();
        Question question1 = new Question();
        Question question2 = new Question();
        Set<Question> questions = new HashSet<>(Arrays.asList(question1, question2));

        when(questionRepository.findByQuiz(quiz)).thenReturn(questions);

        Set<Question> result = questionService.questionsOfQuiz(quiz);

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findByQuiz(quiz);
    }

    @Test
    public void testQuestionsOfQuiz3() {
        Quiz quiz = new Quiz();
        Question question1 = new Question();
        Question question2 = new Question();
        Set<Question> questions = new HashSet<>(Arrays.asList(question1, question2));

        when(questionRepository.findByQuiz(quiz)).thenReturn(questions);

        Set<Question> result = questionService.questionsOfQuiz(quiz);

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findByQuiz(quiz);
    }

    @Test
    public void testQuestionsOfQuiz4() {
        Quiz quiz = new Quiz();
        Question question1 = new Question();
        Question question2 = new Question();
        Set<Question> questions = new HashSet<>(Arrays.asList(question1, question2));

        when(questionRepository.findByQuiz(quiz)).thenReturn(questions);

        Set<Question> result = questionService.questionsOfQuiz(quiz);

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findByQuiz(quiz);
    }

    @Test
    public void testQuestionsOfQuiz5() {
        Quiz quiz = new Quiz();
        Question question1 = new Question();
        Question question2 = new Question();
        Set<Question> questions = new HashSet<>(Arrays.asList(question1, question2));

        when(questionRepository.findByQuiz(quiz)).thenReturn(questions);

        Set<Question> result = questionService.questionsOfQuiz(quiz);

        assertEquals(2, result.size());
        verify(questionRepository, times(1)).findByQuiz(quiz);
    }

    @Test
    public void testDeleteQuestion_QuestionExists() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));
        doNothing().when(questionRepository).deleteById(1L);

        questionService.deletequestion(1L);

        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionExists2() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));
        doNothing().when(questionRepository).deleteById(1L);

        questionService.deletequestion(1L);

        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionExists3() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));
        doNothing().when(questionRepository).deleteById(1L);

        questionService.deletequestion(1L);

        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionExists4() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));
        doNothing().when(questionRepository).deleteById(1L);

        questionService.deletequestion(1L);

        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionExists5() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));
        doNothing().when(questionRepository).deleteById(1L);

        questionService.deletequestion(1L);

        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, times(1)).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionNotFound() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.deletequestion(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionNotFound2() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.deletequestion(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionNotFound3() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.deletequestion(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionNotFound4() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.deletequestion(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, never()).deleteById(1L);
    }

    @Test
    public void testDeleteQuestion_QuestionNotFound5() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.deletequestion(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
        verify(questionRepository, never()).deleteById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionExists() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));

        Question result = questionService.getQuestionById(1L);

        assertEquals(question, result);
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionExists2() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));

        Question result = questionService.getQuestionById(1L);

        assertEquals(question, result);
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionExists3() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));

        Question result = questionService.getQuestionById(1L);

        assertEquals(question, result);
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionExists4() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));

        Question result = questionService.getQuestionById(1L);

        assertEquals(question, result);
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionExists5() throws Exception {
        Question question = new Question();
        when(questionRepository.findById(1L)).thenReturn(Optional.of(question));

        Question result = questionService.getQuestionById(1L);

        assertEquals(question, result);
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionNotFound() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.getQuestionById(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionNotFound2() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.getQuestionById(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionNotFound3() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.getQuestionById(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionNotFound4() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.getQuestionById(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testGetQuestionById_QuestionNotFound5() {
        when(questionRepository.findById(1L)).thenReturn(Optional.empty());

        Exception exception = assertThrows(Exception.class, () -> {
            questionService.getQuestionById(1L);
        });

        assertEquals("Question is not found please enter valid ques id", exception.getMessage());
        verify(questionRepository, times(1)).findById(1L);
    }

    @Test
    public void testAddQuestion1() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.addQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

    @Test
    public void testUpdateQuestion1() {
        Question question = new Question();
        when(questionRepository.save(question)).thenReturn(question);

        Question result = questionService.updateQuestion(question);

        assertEquals(question, result);
        verify(questionRepository, times(1)).save(question);
    }

}