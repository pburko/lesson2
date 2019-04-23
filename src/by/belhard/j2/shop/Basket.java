package by.belhard.j2.shop;

public class Basket extends Product{
    private int totalCount;
    private Double totalPrice;

    public Basket() {
    }

    public void Basket(){
        totalCount = 0;
        totalPrice = 0.0;


        for (String key : Main.basket.linkedHashMap.keySet()) {
            totalCount++;
            totalPrice=totalPrice+Main.basket.linkedHashMap.get(key);
        }
        System.out.println("Всего товаров " + totalCount + " на сумму " + String.format("%.2f", totalPrice) + " р.");

    }


}

