import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shopping.Product;

public class ProductTest {
    @Test
    void getProductDetails() {
        Product product = new Product("TestProduct", 15.0);
        Assertions.assertEquals("TestProduct", product.getName());
    }
}
