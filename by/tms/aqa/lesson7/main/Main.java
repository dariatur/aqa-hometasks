package by.tms.aqa.lesson7.main;

import by.tms.aqa.lesson7.entity.Customer;
import by.tms.aqa.lesson7.entity.Order;
import by.tms.aqa.lesson7.entity.Product;
import by.tms.aqa.lesson7.service.CustomerService;
import by.tms.aqa.lesson7.service.DeliveryService;
import by.tms.aqa.lesson7.service.OrderService;
import by.tms.aqa.lesson7.service.OrderUpdateService;
import by.tms.aqa.lesson7.service.impl.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static CustomerService customerService = new CustomerServiceImpl();
    private static OrderService orderServiceOnline = new OrderServiceOnline();
    private static OrderService orderServicePhone = new OrderServicePhone();
    private static OrderUpdateService orderUpdateService = new OrderUpdateServiceImpl();
    private static DeliveryService deliveryService = new DeliveryServiceImpl();

    public static void main(String[] args) {
        Customer customer = new Customer("Daria", "Sovetskaya 1");
        List<Product> products = createListOfProducts();
        Order order = orderServicePhone.receiveOrder(customer, products);
        orderServiceOnline.receiveOrder(customer, products);
        orderUpdateService.orderPrepare();
        customerService.addProduct(order, new Product("nuggets", 6));
        customerService.changeAddress(order,"Yasnaya 8");
        deliveryService.takeOutDelivery(order);
        deliveryService.orderDelivery(order);
    }

    private static List<Product> createListOfProducts(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("burger", 11));
        products.add(new Product("cola zero", 3));
        products.add(new Product("fries", 5));
        products.add(new Product("sauce", 1));

        return  products;
    }


}
