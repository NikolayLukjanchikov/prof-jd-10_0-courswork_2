package Jd10.Nikolay.Coursework_2.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static Jd10.Nikolay.Coursework_2.contant.Constants.*;
import static Jd10.Nikolay.Coursework_2.contant.Constants.JAVA_QUESTIONS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {

    @Mock
    private MathQuestionRepository mathQuestionRepositoryMock;
    @InjectMocks
    private MathQuestionService out;

    @Test
    void shouldReturnAddedJavaQuestion() {
        when(mathQuestionRepositoryMock.add(MATH_Q_1)).thenReturn(MATH_Q_1);
        assertThat(out.add(MATH_Q_1)).isEqualTo(MATH_Q_1);
    }

    @Test
    void shouldReturnAddedByStringJavaQuestion() {
        when(mathQuestionRepositoryMock.add(MATH_Q_1)).thenReturn(MATH_Q_1);
        assertThat(out.add(MATH_STR_Q_1, MATH_STR_A_1)).isEqualTo(MATH_Q_1);
    }

    @Test
    void shouldReturnRemovedQuestion() {
        when(mathQuestionRepositoryMock.remove(MATH_Q_1)).thenReturn(MATH_Q_1);
        assertThat(out.remove(MATH_Q_1)).isEqualTo(MATH_Q_1);
    }

    @Test
    void shouldReturnCollectionWithAllQuestions() {
        when(mathQuestionRepositoryMock.getAll()).thenReturn(MATH_QUESTIONS);
        assertThat(out.getAll()).isEqualTo(MATH_QUESTIONS);
    }
}