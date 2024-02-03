package shopping;

import java.util.LinkedList;

public class ShoppingCart {
    // List of products, add, delete, get total price of products, display the cart
    public ShoppingCart(Product product){
        this.product = product;
    }
    private final Product product;
    LinkedList<Product> products = new LinkedList<>();

    private void add(Product product) {
        products.add(product);
    }

    private void delete(Product product) {
        products.remove(product);
    }

    private Double getTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    private void display() {
        for (Product p : products) {
            System.out.printf("Product name %s \n Product id %s \n Product price %s \n", p.getName(), p.getId(), p.getPrice());
        }
    }
}

