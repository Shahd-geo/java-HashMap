import java.util.HashMap;

public class ProductPriceDemo {
    static void main(String[] args) {
        HashMap<String,Integer> ProductPriceDemo=new HashMap<>();
        ProductPriceDemo.put("Apple",12);
        ProductPriceDemo.put("Orange",55);
        ProductPriceDemo.put("Ipad",100);
        ProductPriceDemo.put("Phone",300);
        ProductPriceDemo.put("Bananaa",7);
        System.out.println(ProductPriceDemo);
       System.out.println( ProductPriceDemo.get("Ipad"));
        System.out.println( ProductPriceDemo.containsKey("Ipad"));
        ProductPriceDemo.put("Bananaa",3);
        System.out.println(ProductPriceDemo);
        ProductPriceDemo.remove("Orange",55);
        System.out.println(ProductPriceDemo);
        System.out.println(ProductPriceDemo.size());




    }
}
