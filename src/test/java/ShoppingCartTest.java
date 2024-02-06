import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import shopping.Product;
import shopping.ShoppingCart;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    @DisplayName("checking successfully addition to shopping cart")
    public void addToShoppingCartSuccessfully() {
        //GIVEN
        Product product = new Product("e1", "first", 10);
        //WHEN
        shoppingCart.add(product);
        //THEN
        Assertions.assertFalse(shoppingCart.getProducts()
                                           .isEmpty());
        Assertions.assertEquals(product.getCode(), shoppingCart.getProducts()
                                                               .get(0)
                                                               .getCode());
    }

    @Test
    @DisplayName("checking successfully removal from shopping cart")
    public void deleteFromShoppingCartSuccessfully() {
        //GIVEN
        Product product = new Product("e1", "first", 10);
        shoppingCart.add(product);
        //WHEN
        shoppingCart.delete(product);
        //THEN
        Assertions.assertTrue(shoppingCart.getProducts()
                                          .isEmpty());
    }
}
