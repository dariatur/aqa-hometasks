package by.tms.aqa.lesson7.dao.impl;

import by.tms.aqa.lesson7.dao.OrderDAO;
import by.tms.aqa.lesson7.entity.Order;

public class OrderDAOImpl implements OrderDAO {

    @Override
    public boolean saveOrder(Order order) {
        System.out.println("Your order was saved");
        return true;
    }

    @Override
    public boolean updateOrder(Order order) {
        System.out.println("Your order was updated");
        return true;
    }

}
