package by.belhard.j2.lesson4;

public enum Category {
    MILK("Молоко и молочные продукты"),
    MEAT("Мясо и мясные продкты"),
    EGGS("Яйца"),
    FRUITS("Фрукты и овощи"),
    DRINKS("Напитки, соки");

    private String categoryName;
    Category(String categoryName){
        this.categoryName=categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }
}





