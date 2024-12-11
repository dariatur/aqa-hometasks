package by.tms.aqa.lesson5;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private int lecturesAmount;


    public Student(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public Student(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Student(String name, String lastName, int age, int lecturesAmount) {
        this.name = name;
        this.lastName = lastName;
        this.lecturesAmount = lecturesAmount;
        this.age = age;
    }

    public String getFullName(){
        return name + " " + lastName;
    }

    public void printInfo(){
        System.out.println(lastName + " attends " + lecturesAmount + " lectures");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLecturesAmount() {
        return lecturesAmount;
    }

    public void setLecturesAmount(int lecturesAmount) {
        this.lecturesAmount = lecturesAmount;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
