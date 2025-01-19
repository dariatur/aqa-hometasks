package by.tms.aqa.lesson10.service.impl;

import by.tms.aqa.lesson10.bean.Product;
import by.tms.aqa.lesson10.service.Service;

import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service {

    @Override
    public Product findByName(List<Product> products, String name) {
        for (Product product: products) {
            if(product.getName().equals(name)) return product;
        }

        return null;
    }

    @Override
    public List<Product> findAllByCost(List<Product> products, int cost) {
        List<Product> result = new ArrayList<>();
        for(Product product: products){
            if (product.getCost() > cost) result.add(product);
        }

        return result;
    }

    @Override
    public int getQuantity(List<Product> products) {
        int quantity = 0;

        for (Product product: products){
            quantity += product.getQuantity();
        }

        return quantity;
    }

    @Override
    public void addToTheMiddle(List<Product> products, Product product) {
        products.add(products.size()/2, product);
    }

    @Override
    public boolean hasElement(List<Product> products, Product product) {
        return products.contains(product);
    }

    @Override
    public void printAllElem(List<Product> products) {
        for (Product product: products){
            System.out.println(product);
        }
    }

    @Override
    public List<Product> revertList(List<Product> products) {
        List<Product> result = new ArrayList<>();

        for(int i = products.size()-1; i >= 0; i--){
            result.add(products.get(i));
        }

        return result;
    }
}
