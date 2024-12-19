package by.tms.aqa.lesson6;

public class Main {

    public static void main(String[] args) {
        ProductService service = ProductService.getInstance(); //Task 1

        Product[] products = {new Product(Type.AUDIO, 135, "Headphones", true),
                new Product(Type.MOBILE, 1600, "Iphone 16 pro", true),
                new Product(Type.MOBILE, 1000, "Samsung galaxy S21", false),
                new Product(Type.TV, 2600, "Samsung SmartTV", true),
                new Product(Type.MOBILE, 800, "Iphone 16", true),
                new Product(Type.AUDIO, 500, "JBL audio", false
                )};

        System.out.println(service.getPriceForAllProducts(products, Type.AUDIO));
        System.out.println(service.getAmountOfProducts(products, Type.MOBILE));

        StringService.printString("Hello", 5); //Task 2
    }

}
