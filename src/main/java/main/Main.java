package main;

import shopping.Customer;
import shopping.Product;
import shopping.ShoppingCart;

/*
Implement all necessary classes and methods with corresponding logic, and cover them with uni tests.
 */
public class Main {

    public static void main(String[] args) {
            Customer customer = initCustomer();
            ShoppingCart cart = new ShoppingCart();
            checkout(customer);
            startShopping(cart);

    }

    private static void checkout(Customer customer) {
        System.out.println("Info customer: ");
        System.out.println(customer.getName());
    }

    private static Customer initCustomer() {
        return new Customer("Vage", "+79317770", "vage13@mail.ru");
    }

    public static void startShopping(ShoppingCart cart) {
        Product product1 = new Product("Iphone", 1500);
        Product product2 = new Product("Smart Watch", 340);
        Product product3 = new Product("PC", 899);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        System.out.println("Shopping started:");
        cart.displayShoppingCart();
    }


}
