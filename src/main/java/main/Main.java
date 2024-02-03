package main;

import java.util.LinkedList;
import java.util.Scanner;

import shopping.Customer;
import shopping.Product;
import shopping.ShoppingCart;

/*
Implement all necessary classes and methods with corresponding logic, and cover them with uni tests.
 */
public class Main {
    
    public static LinkedList<Product> products = new LinkedList<Product>();
    public static LinkedList<Customer> customers = new LinkedList<Customer>(); 
    public static LinkedList<ShoppingCart> shoppingCarts = new LinkedList<ShoppingCart>();
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        products.add(new Product("bicycle", 100));
        products.add(new Product("TV", 300));

        customers.add(new Customer("james@yahoo.com", "+374637484", shoppingCarts.add(new ShoppingCart())));
        customers.add(new Customer("bob@yahoo.com", "+637648292", shoppingCarts.add(new ShoppingCart())));

        do{
            System.out.println("input: a to add product to cart, d to delete product or s to didplay all products in cart or e to exit");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("a")) {
                addProductToCart();
            }
            if(answer.equalsIgnoreCase("d")) {
                deleteProductFromCart();
            }
            if (answer.equalsIgnoreCase("s")) {
                printAllItemsInCart();
            }
            if (answer.equalsIgnoreCase("e")) {
                break;
            }
        }while(true);

    }

    private static void checkout(Customer customer) {
        //Prepare order to ship
    }

    // private static Customer initCustomer() {
    //     // create customer
    // }

    public static void startShopping(ShoppingCart cart) {
        //start of order creation
    }
    public static boolean isProductAvailable(int productId) {
        
        for(int i = 0; i < products.size(); i++) {
            if(productId == products.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
    public static void addProductToCart() {
        do{
            System.out.println("input productId");
            int selectedProductId = input.nextInt();
            if (isProductAvailable(selectedProductId)) {
                
                System.out.println("product has been added to cart");
                break;
            }
            else {
                System.out.println("product not available, try again");
            }
        }while(true);
    }
    public static void deleteProductFromCart() {
        System.out.println("input product id");
        int deleteProductId = input.nextInt(); 
        for(int i = 0; i < products.size(); i++) {
            if(deleteProductId == products.get(i).getId()) {
                products.remove(i);
                System.out.println("product has been removed");
                break;
            } 
        }
    }
    public static void printAllItemsInCart() {
        for(int i = 0; i < shoppingCarts.size(); i++) {
            System.out.println("name: " + products.get(i).getProductName() + "\nid:" + products.get(i).getId());
        }
      }

}
