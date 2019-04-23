package by.belhard.j2.shop.product;
import by.belhard.j2.shop.Product;

public class Household extends Product {

    public Household(){

        linkedHashMap.put("Мыло", new Double(0.80));
        linkedHashMap.put("Порошок", new Double(2.0));
        linkedHashMap.put("Салфетки", new Double(0.50));
        linkedHashMap.put("Губка", new Double(0.90));
        linkedHashMap.put("Щетка", new Double(1.56));
        linkedHashMap.put("Лампочка", new Double(1.16));
    }

}