package _01_training.exception;

import lombok.Setter;

import java.util.StringJoiner;

public class TxtLineException extends Exception {
    @Setter
    private String errorLine;

    public TxtLineException(String errorLine, Throwable cause) {
        super(cause);
        this.errorLine = errorLine;
    }

    @Override
    public String toString() {
        return "Error Line: " + errorLine;
    }
}
