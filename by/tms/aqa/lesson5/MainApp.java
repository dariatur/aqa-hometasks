package by.tms.aqa.lesson5;

public class MainApp {

    public static void main(String[] args) {
        Student student1 = new Student("Daria", "Tur");
        Student student2 = new Student("Ivan", "Ivanov", 20);
        Student student3 = new Student("Petr", "Petrov", 26, 8);

        student1.setLecturesAmount(6);
        student2.setLecturesAmount(10);

        System.out.println(student1.getFullName());
        System.out.println(student2.getFullName());
        System.out.println(student3.getFullName());

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();

        student3.setLecturesAmount(17);

        student3.printInfo();
    }

}
