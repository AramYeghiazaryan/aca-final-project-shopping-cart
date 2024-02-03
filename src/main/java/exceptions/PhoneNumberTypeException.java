package exceptions;

public class PhoneNumberTypeException extends RuntimeException {
    public PhoneNumberTypeException() {
    }
    public PhoneNumberTypeException(String message) {
        super(message);
    }

}