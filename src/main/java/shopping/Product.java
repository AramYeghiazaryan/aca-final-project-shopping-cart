package shopping;

public class Product {
  // class for each product
  private int id;
  private static int nextId = 2500;
  private String productName;
  private int price;
  public Product(String productName, int price) {
    this.productName = productName;
    this.price = price;
    this.id = nextId;
    nextId++;

  }
  public String getProductName() {
    return this.productName;
  }
  public int price() {
    return this.price;
  }
  public int getId() {
    return this.id;
  }
  
}
