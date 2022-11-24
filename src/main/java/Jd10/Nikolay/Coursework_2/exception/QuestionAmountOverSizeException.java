package Jd10.Nikolay.Coursework_2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionAmountOverSizeException extends RuntimeException{
    public QuestionAmountOverSizeException() {
    }

    public QuestionAmountOverSizeException(String message) {
        super(message);
    }

    public QuestionAmountOverSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionAmountOverSizeException(Throwable cause) {
        super(cause);
    }

    public QuestionAmountOverSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
