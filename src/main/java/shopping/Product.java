package shopping;

public class Product {
    private String name;
    private double price;
    public int quantity;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {

        return price;
    }

    public int getId(){
        return id;
    }


}