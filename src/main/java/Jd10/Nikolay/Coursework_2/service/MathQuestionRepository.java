package Jd10.Nikolay.Coursework_2.service;

import Jd10.Nikolay.Coursework_2.model.Question;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Repository
public class MathQuestionRepository implements QuestionRepository {
    private final Set<Question> mathQuestions;

    public MathQuestionRepository() {
        this.mathQuestions = new HashSet<>();
    }

    @PostConstruct
    private void init() {
        mathQuestions.add(new Question("QMath1", "AMath1"));
        mathQuestions.add(new Question("QMath2", "AMath2"));
        mathQuestions.add(new Question("QMath3", "AMath3"));
        mathQuestions.add(new Question("QMath4", "AMath4"));
        mathQuestions.add(new Question("QMath5", "AMath5"));
        mathQuestions.add(new Question("QMath6", "AMath6"));
        mathQuestions.add(new Question("QMath7", "AMath7"));
        mathQuestions.add(new Question("QMath8", "AMath8"));
        mathQuestions.add(new Question("QMath9", "AMath9"));
        mathQuestions.add(new Question("QMath10", "AMath10"));
        mathQuestions.add(new Question("QMath11", "AMath11"));
        mathQuestions.add(new Question("QMath12", "AMath12"));

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
        return Collections.unmodifiableCollection(mathQuestions);
    }
}
