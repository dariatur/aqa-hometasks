package by.tms.aqa.lesson7.service.impl;

import by.tms.aqa.lesson7.dao.OrderDAO;
import by.tms.aqa.lesson7.dao.impl.OrderDAOImpl;
import by.tms.aqa.lesson7.entity.Customer;
import by.tms.aqa.lesson7.entity.Order;
import by.tms.aqa.lesson7.entity.Product;
import by.tms.aqa.lesson7.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private OrderDAO orderDAO = new OrderDAOImpl();

    @Override
    public void addProduct(Order order, Product product) {
        List<Product> products = order.getProducts();
        products.add(product);
        System.out.println("New product was added to your order");
    }

    @Override
    public void changeAddress(Order order, String newAddress) {
        Customer customer = order.getCustomer();
        customer.setAddress(newAddress);
        orderDAO.updateOrder(order);
        System.out.println("Your address was changed");
    }

}
