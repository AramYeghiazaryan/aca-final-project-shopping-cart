package exceptions;

public class InvalidPhoneNumberException extends RuntimeException {
    public InvalidPhoneNumberException(String phoneNumber) {
        super(String.format("Invalid Phone number %s should be 8 digits and all numbers XXXXXXXX", phoneNumber));
    }
}
