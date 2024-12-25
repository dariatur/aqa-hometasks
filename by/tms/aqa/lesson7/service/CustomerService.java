package by.tms.aqa.lesson7.service;

import by.tms.aqa.lesson7.entity.Order;
import by.tms.aqa.lesson7.entity.Product;

import java.util.List;

public interface CustomerService {

    void addProduct(Order order, Product product);
    void changeAddress(Order order, String newAddress);

}
