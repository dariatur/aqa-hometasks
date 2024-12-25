package by.tms.aqa.lesson8.entity;

public class WindowsPhone extends Phone{

    @Override
    public void call(String phoneNumber) {
        System.out.println("You're calling from windows phone on number " + phoneNumber);
    }

    @Override
    public void firmware() {
        System.out.println("Your windows version is 2.3.1");
    }
}
