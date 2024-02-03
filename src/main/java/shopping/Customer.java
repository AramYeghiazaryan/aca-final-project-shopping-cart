package shopping;

import exceptions.EmailTypeException;
import exceptions.PhoneNumberTypeException;

public class Customer {

    // Customer to be able to shop each customer has its shopping Cart
    // create all necessary fields
    public String email;
    public String phoneNumber;

    // make validation for fields phone number, email,
    public void validator(String email, String phoneNumber) {
        if (phoneNumber.length() != 9) {
            throw new PhoneNumberTypeException("Phone Number must contain 9 characters");
        } else if (phoneNumber.contains(".*[A-Z].*") || phoneNumber.contains(".*[a-z].*")) {
            throw new PhoneNumberTypeException("Phone Number must contain only numbers");
        } else if (!email.contains("@")) {
            throw new EmailTypeException("Email is not contain @ ");
        }
    }

    public Customer(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        validator(this.email,this.phoneNumber);
    }
}

