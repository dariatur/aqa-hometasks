package by.tms.aqa.lesson11.service;

import by.tms.aqa.lesson11.bean.User;

import java.util.*;

public class Service {

    public Map<Integer, Integer> countNumbers(List<Integer> numbers){
        int count = 0;
        int number = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int k = 0; k < numbers.size(); k++){
            number = numbers.get(k);

            for (int i = 0; i < numbers.size(); i++){
                if (number == numbers.get(i)){
                    count++;
                }
            }

            map.put(number, count);
            count = 0;

        }

        return map;
    }

    public Set<String> getNames(List<User> users){
        Set<String> names = new HashSet<>();

        for(User user: users){
            names.add(user.getName());
        }

        return names;
    }

    public Set<User> getSortedSet(List<User> users) {
        Set<User> result = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        result.addAll(users);

        return result;
    }


}
