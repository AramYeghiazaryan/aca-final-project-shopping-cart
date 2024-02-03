package shopping;

public class Customer {
    private String email;
    private String phoneNumber;
    boolean shoppingCart;
    boolean b = true;
    public Customer(String email, String phoneNumber, boolean b) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.shoppingCart = b;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public static boolean validatePhoneNumber(String phoneNumber) {
        for(int i = 0; i < phoneNumber.length(); i++) {
            if (phoneNumber.charAt(i) >= 48 && phoneNumber.charAt(i) <= 57) {
                return true;
            }
        }
        return false;
    }
    // Customer to be able to shop each customer has its shopping Cart
    // create all necessary fields
    
}

