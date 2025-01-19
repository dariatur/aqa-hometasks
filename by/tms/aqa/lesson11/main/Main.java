package by.tms.aqa.lesson11.main;

import by.tms.aqa.lesson11.bean.User;
import by.tms.aqa.lesson11.service.Service;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,3,3,1,6,7,8,2,8,9,2,1,6,7));
        List<User> users = List.of(new User("Kristina", 22),
                new User("Daria", 24),
                new User("Vasili", 78),
                new User("Roman", 56),
                new User("Yury", 35),
                new User("Ksenia", 16),
                new User("Daria", 24),
                new User("Vasili", 78));

        System.out.println(service.countNumbers(numbers));

        System.out.println(service.getNames(users));
        System.out.println(service.getSortedSet(users));
    }


}
