package shopping;

import java.util.ArrayList;

public class ShoppingCart {
    // List of products, add, delete, get total price of products, display the cart
    ArrayList<String> cart = new ArrayList<>();



    public void addToTheCart(String product) {
        if (Product.products.contains(product)) {
            cart.add(product);
            System.out.println("Product added");
        } else {
            try {
                throw new InvalidDataException("The mentioned product doesn't exist");
            } catch (InvalidDataException error4) {
                System.out.println(error4);
            }
        }
    }

    public void deleteFromTheCart(String product) {
        if (this.cart.contains(product)) {
            cart.remove(product);
            System.out.println("Successfully deleted");
        } else {
            try {
                throw new InvalidDataException("The mentioned product isn't in your cart");
            } catch (InvalidDataException error5) {
                System.out.println(error5);
            }

        }

    }

    public int totalPriceOfProducts() {
        String product1;
        int sum = 0;
        for (int i = 0; i < cart.size(); i++) {
            product1 = cart.get(i);
            sum = sum + Integer.parseInt(product1);
        }
        return sum;
    }

    public void displayTheCart() {
        System.out.println(cart.toString());
    }

}
