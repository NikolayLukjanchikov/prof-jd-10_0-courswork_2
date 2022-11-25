package Jd10.Nikolay.Coursework_2.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static Jd10.Nikolay.Coursework_2.contant.Constants.*;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
class JavaQuestionServiceTest {
    @Mock
    private JavaQuestionRepository javaQuestionRepositoryMock;
    @InjectMocks
    private JavaQuestionService out;

    @Test
    void shouldReturnAddedJavaQuestion() {
        when(javaQuestionRepositoryMock.add(JAVA_Q_1)).thenReturn(JAVA_Q_1);
        assertThat(out.add(JAVA_Q_1)).isEqualTo(JAVA_Q_1);
    }

    @Test
    void shouldReturnAddedByStringJavaQuestion() {
        when(javaQuestionRepositoryMock.add(JAVA_Q_1)).thenReturn(JAVA_Q_1);
        assertThat(out.add(JAVA_STR_Q_1, JAVA_STR_A_1)).isEqualTo(JAVA_Q_1);
    }

    @Test
    void shouldReturnRemovedQuestion() {
        when(javaQuestionRepositoryMock.remove(JAVA_Q_1)).thenReturn(JAVA_Q_1);
        assertThat(out.remove(JAVA_Q_1)).isEqualTo(JAVA_Q_1);
    }

    @Test
    void shouldReturnCollectionWithAllQuestions() {
        when(javaQuestionRepositoryMock.getAll()).thenReturn(JAVA_QUESTIONS);
        assertThat(out.getAll()).isEqualTo(JAVA_QUESTIONS);
    }
}