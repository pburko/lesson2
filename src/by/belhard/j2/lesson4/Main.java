package by.belhard.j2.lesson4;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.printf("%-15s%n","| ПРОДУКТЫ В ХОЛОДИЛЬНИКЕ");
        //STR();

        System.out.print("| Продукт \t\t"  + "| Количество " + "| Статус \t" + "| Годен до \t\t" + "| Категория \n");
        Product product1 = new Product("Молоко", 0.5, Units.LITERS, FreshStatus.FRESH,"20.04.2019", Category.MILK);
        Product product2 = new Product("Кефир", 1.0, Units.LITERS, FreshStatus.FRESH,"19.04.2019", Category.MILK);
        Product product3 = new Product("Говядина", 1.2, Units.KILOS, FreshStatus.FRESH,"22.04.2019", Category.MEAT);
        Product product4 = new Product("Кола", 0.2, Units.LITERS, FreshStatus.NOT_FRESH,"10.04.2019", Category.DRINKS);


        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        //Date objDate = new Date();
        //String strDateFormat = "dd.MM.yyyy";
        //SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        //System.out.println(objSDF.format(objDate));


    }
    //public static void LINE(){
        //System.out.println("--------------------------------------------------------------------------------------");
    //}

    //ДОБАВЛЯЕМ ПРОБЕЛЫ, ЕСЛИ ДЛИНА ТЕКСТА <20 СИСМВОЛОВ
    public static String padString(String str, int leng) {
        for (int i = str.length(); i <= leng; i++)
            str += " ";
        return str;
    }
}
