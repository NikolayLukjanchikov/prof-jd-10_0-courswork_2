package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
//@Qualifier("mathQuestionService")
public class MathQuestionService implements QuestionService{
    private final Random random = new Random();
    private final MathQuestionRepository mathQuestions;

    public MathQuestionService(MathQuestionRepository mathQuestions) {
        this.mathQuestions = mathQuestions;
    }


    @Override
    public Question add(String question, String answer) {
        Question questionToAdd = new Question(question, answer);
        mathQuestions.add(questionToAdd);
        return questionToAdd;
    }

    @Override
    public Question add(Question question) {
        mathQuestions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        mathQuestions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return mathQuestions.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> questions = new ArrayList<>(mathQuestions.getAll());
        return questions.get(random.nextInt(questions.size()));
    }
}
