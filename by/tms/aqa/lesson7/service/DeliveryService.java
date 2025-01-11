package by.tms.aqa.lesson7.service;

import by.tms.aqa.lesson7.entity.Order;

public interface DeliveryService {

    void orderDelivery(Order order);

    default void takeOutDelivery(Order order){
        System.out.println("Take out delivery for order " + order);
    }
}
