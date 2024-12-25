package by.tms.aqa.lesson7.service.impl;

import by.tms.aqa.lesson7.dao.OrderDAO;
import by.tms.aqa.lesson7.dao.impl.OrderDAOImpl;
import by.tms.aqa.lesson7.entity.Customer;
import by.tms.aqa.lesson7.entity.Order;
import by.tms.aqa.lesson7.entity.Product;
import by.tms.aqa.lesson7.service.OrderService;

import java.util.List;

public class OrderServicePhone implements OrderService {
    private OrderDAO orderDAO = new OrderDAOImpl();

    @Override
    public Order receiveOrder(Customer customer, List<Product> products) {
        System.out.println("Order was received by phone");
        Order order = new Order(customer, products);
        orderDAO.saveOrder(order);
        return order;
    }
}
