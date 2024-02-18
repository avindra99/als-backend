package com.als.exception;

public class InterviewNotFoundException extends RuntimeException{
    public InterviewNotFoundException() {
        super();
    }

    public InterviewNotFoundException(String message) {
        super(message);
    }

    public InterviewNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
