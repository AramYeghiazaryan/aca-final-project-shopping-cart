package shopping;

import java.util.SplittableRandom;

public class Product {
  // class for each product
    private Product (String name, String id, Double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    private String name;
    private String id;
    private Double price;

    public String getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    Double getPrice(){
        return this.price;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
}
