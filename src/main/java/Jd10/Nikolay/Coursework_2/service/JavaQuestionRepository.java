package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Repository
public class JavaQuestionRepository implements QuestionRepository {
    private final Set<Question> javaQuestions;

    public JavaQuestionRepository() {
        this.javaQuestions = new HashSet<>();
    }

    @PostConstruct
    private void init() {
        javaQuestions.add(new Question("Вопрос1", "Ответ1"));
        javaQuestions.add(new Question("Вопрос2", "Ответ2"));
        javaQuestions.add(new Question("Вопрос3", "Ответ3"));
        javaQuestions.add(new Question("Вопрос4", "Ответ4"));
        javaQuestions.add(new Question("Вопрос5", "Ответ5"));
        javaQuestions.add(new Question("Вопрос6", "Ответ6"));
        javaQuestions.add(new Question("Вопрос7", "Ответ7"));
        javaQuestions.add(new Question("Вопрос8", "Ответ8"));
        javaQuestions.add(new Question("Вопрос9", "Ответ9"));
        javaQuestions.add(new Question("Вопрос10", "Ответ10"));
        javaQuestions.add(new Question("Вопрос11", "Ответ11"));
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
        return Collections.unmodifiableCollection(javaQuestions);
    }

}
