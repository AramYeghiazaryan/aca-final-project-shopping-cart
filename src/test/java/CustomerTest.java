import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shopping.Customer;

public class CustomerTest {
    @Test
    void ValidCustomerCreat() {
        Customer customer = new Customer("John Doe", "+123456789", "john.doe@example.com");
        Assertions.assertNotEquals(customer, null);
    }


}
