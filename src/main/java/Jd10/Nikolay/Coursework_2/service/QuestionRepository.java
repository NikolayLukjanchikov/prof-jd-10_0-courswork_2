package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();


}
