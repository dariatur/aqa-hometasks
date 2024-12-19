package by.tms.aqa.lesson6;

public class StringService {

    private StringService(){};

    public static void printString(String str, int n){
        for (int i = 0; i < n; i++){
            System.out.println(str);
        }
    }
}
