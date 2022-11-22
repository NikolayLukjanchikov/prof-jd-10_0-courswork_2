package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Repository
public class JavaQuestionRepository implements QuestionRepository{
    private Set<Question> javaQuestions;

    public JavaQuestionRepository() {
        this.javaQuestions = new HashSet<>();
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

}
