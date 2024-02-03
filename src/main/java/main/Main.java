package main;

import shopping.Customer;
import shopping.ShoppingCart;

import java.util.LinkedList;

/*
Implement all necessary classes and methods with corresponding logic, and cover them with uni tests.
 */
public class Main {

    public static void main(String[] args) {
        Customer customer = initCustomer("gagulik", "gagulik@gmail.com");
        startShopping(customer);
        checkout(customer);

    }



    private static void checkout(Customer customer) {

    }

    private static Customer initCustomer(String name, String email) {
        new Customer(name, email);
        return null;
    }

    public static void startShopping(Customer cart) {
        //start of order creation
        LinkedList<Customer> products = new LinkedList<>();
        products.add(cart);
    }


}
