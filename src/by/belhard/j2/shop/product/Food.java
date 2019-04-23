package by.belhard.j2.shop.product;
import by.belhard.j2.shop.Product;

public class Food extends Product {
    public Food() {

        linkedHashMap.put("Молоко", new Double(1.20));
        linkedHashMap.put("Хлеб", new Double(1.0));
        linkedHashMap.put("Курица", new Double(5.50));
        linkedHashMap.put("Мороженое", new Double(0.90));
        linkedHashMap.put("Колбаса", new Double(3.56));
        linkedHashMap.put("Макароны", new Double(1.10));
    }

}