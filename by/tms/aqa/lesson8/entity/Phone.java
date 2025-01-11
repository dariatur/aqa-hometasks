package by.tms.aqa.lesson8.entity;

public abstract class Phone {

    public void call(String phoneNumber){
        System.out.println("You called on phone number: " + phoneNumber);
    }

    public void playMusic(int volume){
        System.out.println("You played music on " + volume + " volume");
    }

    public abstract void firmware();

}
