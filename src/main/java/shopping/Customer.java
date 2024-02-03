package shopping;

public class Customer {
    private int phoneNumber;
    private String username;
    private ShoppingCart shoppingCart;

    public Customer(int phoneNumber, String username) {
        this.phoneNumber = phoneNumber;
        this.username = username;
        ShoppingCart shoppingCart = new ShoppingCart();
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }

}

