package shopping;

import exceptions.InvalidEmailException;
import exceptions.InvalidPhoneNumberException;

import java.security.InvalidParameterException;

public class Customer {

    private String name;
    private String email;
    private String phoneNumber;
    private final ShoppingCart shoppingCart = new ShoppingCart();

    public Customer(String name, String email, String phoneNumber) {
        validateEmail(email);
        validatePhoneNumber(phoneNumber);

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 8) {
            throw new InvalidPhoneNumberException(phoneNumber);
        }
        for (char elem : phoneNumber.toCharArray()) {
            if (!Character.isDigit(elem)) {
                throw new InvalidPhoneNumberException(phoneNumber);
            }
        }
    }

    private void validateEmail(String email) {
        // !(email.contains("@") && email.contains("."))
        if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException(email);
        }
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}

