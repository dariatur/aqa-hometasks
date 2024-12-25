package by.tms.aqa.lesson7.entity;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;

    public Order(){};

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return customer + ", products = " + products;
    }
}
