package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
//    private final Random random = new Random();
    private final JavaQuestionRepository javaQuestions;

    public JavaQuestionService(JavaQuestionRepository javaQuestions) {
        this.javaQuestions = javaQuestions;
    }
    public Random makeRandom() {
        return new Random();
    }

    Random random = makeRandom();
    @Override
    public Question add(String question, String answer) {
        Question questionToAdd = new Question(question, answer);
        javaQuestions.add(questionToAdd);
        return questionToAdd;
    }

    @Override
    public Question add(Question question) {
        javaQuestions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        javaQuestions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return javaQuestions.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        List<Question> questions = new ArrayList<>(javaQuestions.getAll());
        return questions.get(random.nextInt(questions.size()));
    }
}
