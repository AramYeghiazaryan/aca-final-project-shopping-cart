package shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productsCart;

    public ShoppingCart() {
        this.productsCart = new ArrayList<>();
    }

    public List<Product> getProductsCart() {
        return productsCart;
    }

    public void addProduct(Product product) {
        this.productsCart.add(product);
    }

    public void removeProduct(Product product) {
        this.productsCart.remove(product);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for(Product product : productsCart) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayShoppingCart() {
        System.out.println("Shopping Cart:");
        for(Product product : productsCart) {
            System.out.println(product.getName() + " - " + product.getPrice() + " $");
        }
        System.out.println("Total price: " + calculateTotalPrice() + " $");
    }
}
