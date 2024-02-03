package shopping;

public class Product {
  // class for each product
    public String name;
    public int price;
    public String isbn;

    public Product(String name, int price, String isbn) {
        this.name = name;
        this.price = price;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
