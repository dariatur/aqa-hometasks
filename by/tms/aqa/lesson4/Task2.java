package by.tms.aqa.lesson4;

import java.util.Arrays;
import java.util.Random;

/* Есть числовой массив, необходимо вывести информацию о его элементах
1) количество элементов
2) сумма элементов
3) макс элемент
4) мин элемент
*/
public class Task2 {

    public static void main(String[] args) {
        int[] mas = addRandomElements(20);

        System.out.println(Arrays.toString(mas));
        System.out.println("Amount of elements in array: " + mas.length);
        System.out.println("Sum of elements: " + sum(mas));
        System.out.println("Maximum: " + max(mas));
        System.out.println("Minimum: " + min(mas));
    }

    public static int sum(int[] mas){
        int sum = 0;

        for(int elem: mas){
            sum += elem;
        }

        return sum;
    }

    public static int max(int[] mas){
        int max = mas[0];

        for(int elem: mas){
            if(elem > max){
                max = elem;
            }
        }

        return max;
    }

    public static int min(int[] mas){
        int min = mas[0];

        for(int elem: mas){
            if(elem < min){
                min = elem;
            }
        }

        return min;
    }

    public static int[] addRandomElements(int n){
        int[] result = new int[n];
        Random random = new Random();

        for(int i = 0; i < n; i++){
            result[i] = random.nextInt(-100,101);
        }

        return result;
    }
}
