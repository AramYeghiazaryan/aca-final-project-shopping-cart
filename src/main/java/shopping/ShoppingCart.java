package shopping;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    private List<Product> cartItems;


    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addToCart() {
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        int quantity = input.nextInt();
        Product product1 = new Product("product1", 11, 1);
        Product product2 = new Product("product2", 12, 2);
        Product product3 = new Product("product3", 13, 3);
        Product product4 = new Product("product4", 14, 4);
        Product product5 = new Product("product5", 15, 5);
        if (id == product1.getId()) {
            cartItems.add(product1);
            product1.quantity = quantity;
            System.out.println(product1.getName() + " added to cart ");
        }
        if (id == product2.getId()) {
            cartItems.add(product2);
            product2.quantity = quantity;
            System.out.println(product2.getName() + " added to cart ");
        }
        if (id == product3.getId()) {
            cartItems.add(product3);
            product3.quantity = quantity;
            System.out.println(product3.getName() + " added to cart ");
        }
        if (id == product4.getId()) {
            cartItems.add(product4);
            product4.quantity = quantity;
            System.out.println(product4.getName() + " added to cart ");
        }
        if (id == product5.getId()) {
            cartItems.add(product5);
            product5.quantity = quantity;
            System.out.println(product5.getName() + " added to cart ");
        } else {
            System.out.println("Please type in a valid product id");
        }

    }


    public void removeFromCart() {
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        int quantity = input.nextInt();
        Product product1 = new Product("product1", 11, 1);
        Product product2 = new Product("product2", 12, 2);
        Product product3 = new Product("product3", 13, 3);
        Product product4 = new Product("product4", 14, 4);
        Product product5 = new Product("product5", 15, 5);
        if (id == product1.getId()) {
            cartItems.remove(product1);
            product1.quantity = quantity;
            System.out.println(product1.getName() + " removed to cart ");
        }
        if (id == product2.getId()) {
            cartItems.remove(product2);
            product2.quantity = quantity;
            System.out.println(product2.getName() + " removed to cart ");
        }
        if (id == product3.getId()) {
            cartItems.remove(product3);
            product3.quantity = quantity;
            System.out.println(product3.getName() + " removed to cart ");
        }
        if (id == product4.getId()) {
            cartItems.remove(product4);
            product4.quantity = quantity;
            System.out.println(product4.getName() + " removed to cart ");
        }
        if (id == product5.getId()) {
            cartItems.remove(product5);
            product5.quantity = quantity;
            System.out.println(product5.getName() + " removed to cart ");
        } else {
            System.out.println("Please type in a valid product id");
        }
    }


    public void viewCart() {
        System.out.println("\nShopping Cart:");
        boolean b = true;
        for (int i = 0; i < cartItems.size(); i++) {

            if (i == 0) {
                System.out.println(print(cartItems.get(i)));
            } else if (cartItems.get(i - 1).equals(cartItems.get(i))) {
                continue;
            } else {
                System.out.println(print(cartItems.get(i)));

            }
        }

    }
public void viewTotalPrice(){
       double total = 0;
        for(Product item: cartItems){
            total += item.getPrice();
        }
    System.out.println(total);

}

    public void checkout() {
        double total = 0;
        for (Product item : cartItems) {
            total += item.getPrice();
        }

        System.out.println("\nTotal: $" + total);
        System.out.println("Thank you for your purchase!");
        cartItems.clear();
    }

    public String print(Product item) {
        return ("Product{" +
                "name='" + item.getName() + '\'' +
                ", price=" + item.getPrice() + "$" +
                ", quantity='" + item.quantity +
                '}');
    }
}


