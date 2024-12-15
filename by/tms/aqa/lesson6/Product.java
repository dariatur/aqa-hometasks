package by.tms.aqa.lesson6;

public class Product {
    private Type type;
    private int price;
    private String name;
    private boolean isInStock;

    public Product(){};

    public Product(Type type, int price, String name, boolean isInStock){
        this.type = type;
        this.price = price;
        this.name = name;
        this.isInStock = isInStock;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
