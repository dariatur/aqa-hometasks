package by.tms.aqa.lesson7.service.impl;

import by.tms.aqa.lesson7.entity.Order;
import by.tms.aqa.lesson7.service.DeliveryService;

public class DeliveryServiceImpl implements DeliveryService {

    @Override
    public void orderDelivery(Order order) {
        System.out.println("Order: " + order + " was delivered by courier");
    }
}
