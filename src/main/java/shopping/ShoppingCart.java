package shopping;

import exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void delete(Product product) {
        int indexToDelete = -1;
        for (int i = 0; i < products.size(); i++) {
            if (product.getCode()
                       .equals(products.get(i)
                                       .getCode())) {
                indexToDelete = i;
            }
        }
        if (indexToDelete == -1) {
            throw new ProductNotFoundException();
        }
        products.remove(indexToDelete);
    }

    public double getTotalPrice() {
        return products.stream()
                       .mapToDouble(Product::getPrice)
                       .sum();

    }

    public String displayCart() {
        return products.toString();
    }

    public List<Product> getProducts() {
        return products;
    }
}
