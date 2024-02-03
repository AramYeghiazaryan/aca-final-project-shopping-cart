import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import shopping.Product;
import shopping.ShoppingCart;

public class ShoppingCartTest {
    @Test
    void calculateTotal() {
        Product product1 = new Product("Product1", 10.0);
        Product product2 = new Product("Product2", 20.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        Assertions.assertEquals(30.0, cart.calculateTotalPrice(), 0.01);
    }

}
