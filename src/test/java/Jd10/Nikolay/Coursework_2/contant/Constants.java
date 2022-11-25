package Jd10.Nikolay.Coursework_2.contant;

import Jd10.Nikolay.Coursework_2.model.Question;

import java.util.Collection;
import java.util.Set;

public class Constants {
    public static final Question JAVA_Q_1 = new Question("Вопрос1", "Ответ1");
    public static final String JAVA_STR_Q_1 = "Вопрос1";
    public static final String JAVA_STR_A_1 = "Ответ1";
    public static final Question MATH_Q_1 = new Question("QMath1", "AMath1");
    public static final String MATH_STR_Q_1 = "QMath1";
    public static final String MATH_STR_A_1 = "AMath1";

    public static final Collection<Question> JAVA_QUESTIONS = Set.of(
            new Question("Вопрос1", "Ответ1"),
            new Question("Вопрос2", "Ответ2"),
            new Question("Вопрос3", "Ответ3")
    );
    public static final Collection<Question> MATH_QUESTIONS = Set.of(
            new Question("QMath1", "AMath1"),
            new Question("QMath2", "AMath2"),
            new Question("QMath3", "AMath3")
    );

    public static final Collection<Question> RND_QUESTIONS = Set.of(
            new Question("QMath1", "AMath1"),
            new Question("QMath2", "AMath2"),
            new Question("QMath3", "AMath3"),
            new Question("QMath4", "AMath4")
    );


}
