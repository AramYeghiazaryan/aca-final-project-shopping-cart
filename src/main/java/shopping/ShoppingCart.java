package shopping;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
  // List of products, add, delete, get total price of products, display the cart

    private List<String> products;

    public ShoppingCart(){
        this.products=new ArrayList<>();
    }
    public void addProduct(String product){
        products.add(product);
    }
    public void removeProduct(String product){
        products.remove(product);
    }
    public void displayCart(){
        System.out.println("Shopping Cart Contents: ");
        for (String product : products){
            System.out.println(product);
        }
    }
}
