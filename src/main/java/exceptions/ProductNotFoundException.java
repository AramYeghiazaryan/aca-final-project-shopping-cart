package exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException() {
        super("No product found");
    }
}
