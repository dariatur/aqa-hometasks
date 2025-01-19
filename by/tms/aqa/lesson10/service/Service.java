package by.tms.aqa.lesson10.service;

import by.tms.aqa.lesson10.bean.Product;

import java.util.List;

public interface Service {

    Product findByName(List<Product> products, String name);
    List<Product> findAllByCost(List<Product> products, int cost);
    int getQuantity(List<Product> products);
    void addToTheMiddle(List<Product> products, Product product);
    boolean hasElement(List<Product> products, Product product);
    void printAllElem(List<Product> products);
    List<Product> revertList(List<Product> products);

}
