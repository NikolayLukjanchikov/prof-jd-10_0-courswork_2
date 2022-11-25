package Jd10.Nikolay.Coursework_2.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static Jd10.Nikolay.Coursework_2.contant.Constants.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionServiceMock;
    @Mock
    private MathQuestionService mathQuestionServiceMock;

    @InjectMocks
    private ExaminerServiceImpl out;



    @Test
    void getQuestions() {
//        out.jQuestionService.add(JAVA_Q_1);
//        out.jQuestionService.add(JAVA_Q_1);
//        out.jQuestionService.add(JAVA_Q_1);
//        out.jQuestionService.add(JAVA_Q_1);
//        out.jQuestionService.add(JAVA_Q_1);
//        out.mQuestionService.add(MATH_Q_1);
//        out.mQuestionService.add(MATH_Q_1);
//        out.mQuestionService.add(MATH_Q_1);
//        out.mQuestionService.add(MATH_Q_1);
//        out.mQuestionService.add(MATH_Q_1);
//        out.mQuestionService.add(MATH_Q_1);

        when(out.jQuestionService.getAll()).thenReturn(JAVA_QUESTIONS);
        when(out.mQuestionService.getAll()).thenReturn(MATH_QUESTIONS);
//        when(out.jQuestionService.getRandomQuestion()).thenReturn(JAVA_Q_1);
//        when(out.mQuestionService.getRandomQuestion()).thenReturn(MATH_Q_1);
//        when(out.makeRandom().nextInt(2)).thenReturn(2);

       when(out.getQuestions(2)).thenReturn(RND_QUESTIONS);
//
        assertThat(out.getQuestions(2)).isEqualTo(RND_QUESTIONS);
        //assertIterableEquals(out.getQuestions(3), RND_QUESTIONS);


    }
}