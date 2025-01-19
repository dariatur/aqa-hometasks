package by.tms.aqa.lesson10.main;

import by.tms.aqa.lesson10.bean.Product;
import by.tms.aqa.lesson10.service.Service;
import by.tms.aqa.lesson10.service.impl.ServiceImpl;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("Phone", 100, 40),
                new Product("Laptop", 500, 30),
                new Product("Cable", 5, 190),
                new Product("TV", 1500, 60),
                new Product("Earphones", 50, 35),
                new Product("Charger", 12, 67)));

        Service service = new ServiceImpl();
        Product product = new Product("Monitor", 450, 32);

        System.out.println(service.findByName(products,"Phone"));
        System.out.println("-----------------");

        System.out.println(service.findAllByCost(products, 100));
        System.out.println("-----------------");

        System.out.println(service.getQuantity(products));
        System.out.println("-----------------");

        service.addToTheMiddle(products, product);
        System.out.println(service.hasElement(products, product));
        System.out.println("-----------------");

        service.printAllElem(products);
        System.out.println("-----------------");

        service.printAllElem(service.revertList(products));

    }

}
