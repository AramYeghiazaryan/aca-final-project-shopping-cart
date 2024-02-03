package shopping;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    // Customer to be able to shop each customer has its shopping Cart
    // create all necessary fields
    // make validation for fields phone number, email,

    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private List<String> shoppingCart;

    public Customer(String firstName, String lastName, int phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.shoppingCart = new ArrayList<>();
    }

    public void addToShoppingCart(ShoppingCart item) {
        shoppingCart.add(item.toString());
    }

    private boolean isValidPhoneNumber(int phoneNumber) {
       return String.valueOf(phoneNumber).length()==9;
    }
    private boolean isValidEmail(String email){
        return email.contains("@");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<String> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}

