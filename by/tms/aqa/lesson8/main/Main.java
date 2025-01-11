package by.tms.aqa.lesson8.main;

import by.tms.aqa.lesson8.entity.AndroidPhone;
import by.tms.aqa.lesson8.entity.ApplePhone;
import by.tms.aqa.lesson8.entity.Phone;
import by.tms.aqa.lesson8.entity.WindowsPhone;
import by.tms.aqa.lesson8.service.CheckService;
import by.tms.aqa.lesson8.service.impl.CheckServiceImpl;

public class Main {

    public static void main(String[] args) {
        CheckService checkService = new CheckServiceImpl();
        Phone iphone = new ApplePhone();
        Phone android = new AndroidPhone();
        Phone windowsPhone = new WindowsPhone();
        checkService.checkDevice(iphone);
        checkService.checkDevice(android);
        checkService.checkDevice(windowsPhone);

        Phone anonymousPhone = new Phone() {
            @Override
            public void firmware() {
                System.out.println("Anonymous: you version is 10.1");
            }
        };

        checkService.checkDevice(anonymousPhone);
    }

}
