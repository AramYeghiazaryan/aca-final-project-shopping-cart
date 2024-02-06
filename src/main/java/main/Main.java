package main;

import shopping.Customer;
import shopping.Product;
import shopping.ShoppingCart;

/*
Implement all necessary classes and methods with corresponding logic, and cover them with uni tests.
 */
public class Main {

    private final Product product = new Product("e1", "first", 10);
    private final Product product2 = new Product("e2", "second", 20);
    private final Product product3 = new Product("e3", "third", 30);

    public static void main(String[] args) {
        Customer customer = initCustomer();
        startShopping(customer.getShoppingCart());
        checkout(customer);

    }

    private static void checkout(Customer customer) {
        //
    }

    private static Customer initCustomer() {
        return new Customer("Poghos", "poghos@gmail.com", "88888888");
    }

    public static void startShopping(ShoppingCart cart) {
        // Logic with switch to add
    }


}
