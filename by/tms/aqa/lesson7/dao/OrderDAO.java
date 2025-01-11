package by.tms.aqa.lesson7.dao;

import by.tms.aqa.lesson7.entity.Order;

public interface OrderDAO {

    boolean saveOrder(Order order);
    boolean updateOrder(Order order);

}
