package by.tms.aqa.lesson6;

public class ProductService {
    private static final ProductService instance = new ProductService();

    private ProductService(){};

    public static ProductService getInstance(){
        return instance;
    }

    public int getPriceForAllProducts(Product[] products, Type type){
        int price = 0;

        for (Product product: products) {
            if(product.getType() == type) {
                price += product.getPrice();
            }
        }

        return price;
    }

    public int getAmountOfProducts(Product[] products, Type type){
        int count = 0;

        for (Product product: products) {
            if(product.isInStock() && product.getType() == type) {
                count++;
            }
        }

        return count;
    }
}
