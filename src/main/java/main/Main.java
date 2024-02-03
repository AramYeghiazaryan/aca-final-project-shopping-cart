package main;

import shopping.Customer;
import shopping.ShoppingCart;

/*
Implement all necessary classes and methods with corresponding logic, and cover them with uni tests.
 */
public class Main {

    public static void main(String[] args) {
        Customer customer = initCustomer();
        startShopping(customer.getShoppingCart().get(0));
        checkout(customer);

    }
    private static Customer initCustomer() {
        System.out.println("Initializing customer...");
        Customer customer = new Customer("Artur","Shalaghoyan", "099678637", "art.shalag@mail.ru");

    }

    private static void checkout(Customer customer) {
        //Prepare order to ship
    }

    private static Customer initCustomer() {
        // create customer

    }

    public static void startShopping(ShoppingCart cart) {
        //start of order creation
    }


}
