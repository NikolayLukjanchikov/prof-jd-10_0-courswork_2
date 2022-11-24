package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.exception.QuestionAmountOverSizeException;
import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    public Random random = new Random();

    public QuestionService jQuestionService;
    public QuestionService mQuestionService;

    @Autowired
    public ExaminerServiceImpl(@Qualifier("javaQuestionService") QuestionService jQuestionService,
                               @Qualifier("mathQuestionService") QuestionService mQuestionService) {
        this.jQuestionService = jQuestionService;
        this.mQuestionService = mQuestionService;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > (jQuestionService.getAll().size() + mQuestionService.getAll().size())) {
            throw new QuestionAmountOverSizeException("Нет такого количества вопросов");
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            if (random.nextInt(2) == 1) {
                questions.add(jQuestionService.getRandomQuestion());
            } else {
                questions.add(mQuestionService.getRandomQuestion());
            }
        }
        return Collections.unmodifiableCollection(questions);
    }

}

