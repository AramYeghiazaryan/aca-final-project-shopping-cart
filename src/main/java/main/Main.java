package main;

import shopping.Customer;
import shopping.ShoppingCart;
import shopping.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Implement all necessary classes and methods with corresponding logic, and cover them with uni tests.
 */
public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product product1 = new Product("product1", 11, 1);
        Product product2 = new Product("product2", 12, 2);
        Product product3 = new Product("product3", 13, 3);
        Product product4 = new Product("product4", 14, 4);
        Product product5 = new Product("product5", 15, 5);
        Customer customer = initCustomer(90876, "samo");

        startShopping(shoppingCart);
//        checkout(customer);


    }


    private static Customer initCustomer(int phonenumber, String username) {
        // create customer
        Scanner input = new Scanner(System.in);
//        int phonenumber = input.nextInt();
//        String username = input.nextLine();
        Customer customer = new Customer(phonenumber, username);
        return customer;
    }

    private static void viewProducts() {
        ArrayList<Product> productList = new ArrayList<>();
        Product product1 = new Product("product1", 11, 1);
        Product product2 = new Product("product2", 12, 2);
        Product product3 = new Product("product3", 13, 3);
        Product product4 = new Product("product4", 14, 4);
        Product product5 = new Product("product5", 15, 5);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(print(productList.get(i)));
        }

    }

    public static void startShopping(ShoppingCart cart) {
        Scanner input = new Scanner(System.in);
        int choiceOfTheCustomer = 0;
        do {
            System.out.println("Hello and welcome to our shop");
            System.out.println("For viewing our product type ---> 1");
            System.out.println("For adding a product to your cart type ---> 2");
            System.out.println("For checking out type ---> 3");
            System.out.println("For viewing your cart type ---> 4");
            System.out.println("For removing a product from your cart type ---> 5");
            System.out.println("For exiting our shop type ---> 6");
            System.out.println("For viewing the total price type ---> 7");
            choiceOfTheCustomer = input.nextInt();
            switch (choiceOfTheCustomer) {
                case 1 -> viewProducts();
                case 2 ->  cart.addToCart();
                case 3 -> cart.checkout();
                case 4 -> cart.viewCart();
                case 5 -> cart.removeFromCart();
                case 6 -> System.out.println("Thank you for shopping with us");
                case 7 -> cart.viewTotalPrice();
                default -> System.out.println("Please type a valid command");
            }


        } while (choiceOfTheCustomer != 6);

    }

    public static String print(Product item) {
        return ("Product{" +
                "name='" + item.getName() + '\'' +
                ", price=" + item.getPrice() + "$" +
                "," + "id="+ item.getId() +
                '}');
    }

}
