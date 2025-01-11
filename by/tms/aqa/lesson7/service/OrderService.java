package by.tms.aqa.lesson7.service;

import by.tms.aqa.lesson7.entity.Customer;
import by.tms.aqa.lesson7.entity.Order;
import by.tms.aqa.lesson7.entity.Product;

import java.util.List;

public interface OrderService {

    Order receiveOrder(Customer customer, List<Product> products);

}
