import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import shopping.Customer;

import java.util.stream.Stream;

public class CustomerTest {

    @Test
    @DisplayName("check successfull creation of customer")
    public void createCustomerSuccessful() {
        //Given
        String name = "Vanush";
        String email = "gagik@email.com";
        String phoneNumber = "00000000";
        //When
        Customer customer = new Customer(name, email, phoneNumber);
        //Then
        Assertions.assertNotNull(customer);
    }

    @ParameterizedTest
    @MethodSource("getParams")
    @DisplayName("check unseuccessfull creation of customer")
    public void createCustomerFailur(String name, String email, String phoneNumber) {
        //Given
        //When
        //Then
        Assertions.assertThrows(RuntimeException.class, () -> new Customer(name, email, phoneNumber));
    }

    public static Stream<Arguments> getParams() {
        return Stream.of(
                Arguments.of("a", "s", "88888888"),
                Arguments.of("a", "s.", "88888888"),
                Arguments.of("a", "s@", "88888888"),
                Arguments.of("a", "s@.", "8888888"),
                Arguments.of("a", "s@.", "888888888"),
                Arguments.of("a", "s@.", "888888#8")
        );
    }

}
