package by.belhard.j2.shop.product;
import by.belhard.j2.shop.Product;

public class Pet extends Product {
    public Pet(){

        linkedHashMap.put("Корм для кошек", new Double(3.60));
        linkedHashMap.put("Корм для собак", new Double(6.56));
        linkedHashMap.put("Крупа для птиц", new Double(2.10));
        linkedHashMap.put("Игрушка", new Double(5.0));
        linkedHashMap.put("Щетка", new Double(2.50));
        linkedHashMap.put("Лоток", new Double(7.90));
    }

}
