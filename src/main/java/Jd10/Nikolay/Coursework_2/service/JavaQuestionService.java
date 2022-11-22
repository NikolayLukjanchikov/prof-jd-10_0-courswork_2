package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {

//    private Set<Question> javaQuestions;
//
//    public JavaQuestionService() {
//        this.javaQuestions = new HashSet<>();
//    }

    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        //Реализация метода getRandomQuestion осуществляется с помощью класса Random и его метода nextInt,
        // который в качестве параметра принимает максимальное число,
        // а затем возвращает вам результат в виде случайного числа от 0 до максимального числа из параметров (не включительно).
        return null;
    }
}
