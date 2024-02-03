package shopping;

public class Customer {
    private String name;
    private String phoneNumber;
    private String email;
    private ShoppingCart shoppingCart;

    public Customer(String name, String phoneNumber, String email) {
        this.name = name;
        if(isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }
        if(isValidEmail(email)) {
            this.email = email;
        }
        this.shoppingCart = new ShoppingCart();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    private boolean isValidPhoneNumber(String phoneNumber){
        return phoneNumber.matches("\\+\\d{8}");
    }

    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}

