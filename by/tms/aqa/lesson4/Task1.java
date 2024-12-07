package by.tms.aqa.lesson4;
/*Есть 2 числовых массива разной длины (без дубликатов в рамках каждого массива)
Необходимо вывести в терминал все элементы, которые встречаются в обоих массивах*/

public class Task1 {

    public static void main(String[] args) {

        int[] mas1 = {1, 9, 10, 2, 8};
        int[] mas2 = {1, 3, 5, 6, 7, 4, 2, 9}; //1, 9, 2 встречаются в обоих

        printDuplicates(mas1, mas2);

    }

    public static void printDuplicates(int[] mas1, int[] mas2){

        if(mas1.length == 0 || mas2.length == 0){
            return;
        }

        for(int elem1: mas1) {
            for(int elem2: mas2) {
                if (elem1 == elem2) {
                    System.out.println(elem1);
                }
            }
        }

    }

}
