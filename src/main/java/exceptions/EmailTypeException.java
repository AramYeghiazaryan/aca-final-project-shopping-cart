package exceptions;

public class EmailTypeException extends RuntimeException {
    public EmailTypeException() {
    }
    public EmailTypeException(String message) {
        super(message);
    }
}

