package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.exception.QuestionAmountOverSizeException;
import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    public Random random;
    public final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new QuestionAmountOverSizeException("Нет такого количества вопросов");
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return Collections.unmodifiableCollection(questions);
    }
}

