package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
