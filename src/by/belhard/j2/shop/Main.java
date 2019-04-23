package by.belhard.j2.shop;
import by.belhard.j2.shop.product.*;

public class Main {

    static String addBasketFood, addBasketHousehold, addBasketPet;
    public static Basket basket = new Basket();
    static Integer pQuantity=0;
    static String addBasket;
    static String addBasketProductTitle;
    static String addBasketProductQuantity;

    public static void main(String[] args) {

        Food food = new Food();
        Household household = new Household();
        Pet pet = new Pet();

        System.out.println("Продукты в продаже: " + food.linkedHashMap);
        System.out.println("Хозтовары в продаже: " + household.linkedHashMap);
        System.out.println("Зоотовары в продаже: " + pet.linkedHashMap);

        addBasketFood="Хлеб, 1"; addBasketFood();
        addBasketFood="Молоко, 2"; addBasketFood();
        addBasketFood="Курица, 1"; addBasketFood();
        addBasketHousehold="Порошок, 1"; addBasketHousehold();
        addBasketHousehold="Губка, 4"; addBasketHousehold();
        addBasketPet="Корм для кошек, 2"; addBasketPet();
        addBasketPet="Корм для собак, 1"; addBasketPet();

        System.out.println("");
        System.out.println("Товары в корзине: " + basket.linkedHashMap);

        basket.Basket(); //подсчет количества товара и итоговой суммы
    }

    public static void addBasketFood(){
        Food food = new Food();

        addBasket = addBasketFood;
        String[] addBasketProduct = addBasket.split(",");
        addBasketProductTitle = addBasketProduct[0];
        addBasketProductQuantity = addBasketProduct[1];
        check(); //исключение, если количество товара не число => 1

        if (food.linkedHashMap.containsKey(addBasketProductTitle)){ //проверяем наличие товара, если есть, то добавляем в корзину
            basket.linkedHashMap.put(addBasketProductTitle + " x" + pQuantity, new Double(food.linkedHashMap.get(addBasketProductTitle) * pQuantity));
        }
        else {
            System.out.println("Товара '" + addBasketProductTitle + "' нет в продаже");
        }

        pQuantity=0;
    }

    public static void addBasketHousehold(){
        Household household = new Household();

        addBasket = addBasketHousehold;
        String[] addBasketProduct = addBasket.split(",");
        addBasketProductTitle = addBasketProduct[0];
        addBasketProductQuantity = addBasketProduct[1];
        check(); //исключение, если количество товара не число => 1

        if ( household.linkedHashMap.containsKey(addBasketProductTitle)){ //проверяем наличие товара, если есть, то добавляем в корзину
            basket.linkedHashMap.put(addBasketProductTitle + " x" + pQuantity, new Double( household.linkedHashMap.get(addBasketProductTitle) * pQuantity));
        }
        else {
            System.out.println("Товара '" + addBasketProductTitle + "' нет в продаже");
        }

        pQuantity=0;
    }

    public static void addBasketPet(){
        Pet pet = new Pet();

        addBasket = addBasketPet;
        String[] addBasketProduct = addBasket.split(",");
        addBasketProductTitle = addBasketProduct[0];
        addBasketProductQuantity = addBasketProduct[1];
        check(); //исключение, если количество товара не число => 1

        if ( pet.linkedHashMap.containsKey(addBasketProductTitle)){ //проверяем наличие товара, если есть, то добавляем в корзину
            basket.linkedHashMap.put(addBasketProductTitle + " x" + pQuantity, new Double( pet.linkedHashMap.get(addBasketProductTitle) * pQuantity));
        }
        else {
            System.out.println("Товара '" + addBasketProductTitle + "' нет в продаже");
        }

        pQuantity=0;
    }

    public static void check(){

        try {
            pQuantity = new Integer(addBasketProductQuantity.replace(" ", ""));
        }catch (NumberFormatException e) {
            System.err.println("Указано неверное количество товара '" + addBasketProductTitle + "'");
            return;
        }
        if(pQuantity < 1) {
            System.err.println("Указано неверное количество товара '" + addBasketProductTitle + "'");
            return;
        }
    }


}