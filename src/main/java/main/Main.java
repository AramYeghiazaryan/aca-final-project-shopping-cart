package main;

import shopping.Customer;
import shopping.Product;
import shopping.ShoppingCart;

import java.util.Scanner;

/*
Implement all necessary classes and methods with corresponding logic, and cover them with uni tests.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        productAdding();
        System.out.println("Enter your name -> ");
        String customerName = scanner.nextLine();
        System.out.println("Enter your phone number -> ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter your email -> ");
        String email = scanner.nextLine();
        Customer customer = initCustomer(customerName, phoneNumber, email);
        startShopping();
        checkout(customer);

    }

    private static void checkout(Customer customer) {
        //Prepare order to ship
    }

    private static Customer initCustomer(String customerName, String phoneNumber, String email) {
        // create customer
        Customer customer = new Customer(customerName, phoneNumber, email);
        return customer;
    }

    public static void startShopping() {
        //start of order creation
        ShoppingCart cart = new ShoppingCart();
        Scanner input = new Scanner(System.in);
        System.out.println(Product.products);
        System.out.println("To add a product to your cart, input 1");
        System.out.println("To delete a product from your cart, input 2");
        System.out.println("To display the products in your cart, input 3");
        System.out.println("To see the total price of the products you are buying, input 4");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Insert the product name");
                String productName = input.nextLine();
                cart.addToTheCart(productName);
            }
            case 2 -> {
                System.out.println("Insert the name of the product you want to delete -> ");
                String productName1 = input.nextLine();
                cart.deleteFromTheCart(productName1);
            }
            case 3 -> cart.displayTheCart();
            case 4 -> cart.totalPriceOfProducts();
            default -> System.out.println("Please insert a number mentioned above");
        }

    }

    public static void productAdding() {
        Product product = new Product();
        product.addToTheProducts("Coca Cola - 5$");
        product.addToTheProducts("Fanta - 5$");
        product.addToTheProducts("Lay's - 10$");
        product.addToTheProducts("merci(small) - 3$");
        product.addToTheProducts("merci(medium) - 6$");
        product.addToTheProducts("merci(big) - 10$");
    }

}
