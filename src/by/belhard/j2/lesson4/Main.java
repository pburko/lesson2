package by.belhard.j2.lesson4;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.printf("%-15s%n","| ПРОДУКТЫ В ХОЛОДИЛЬНИКЕ");
        //STR();
        int iProduct=6;

        Product[] p = new Product[iProduct];
        LINE();
        System.out.print("| Продукт \t\t"  + "| Количество " + "| Статус \t\t" + "| Годен до \t\t" + "| Категория \n");

        p[0]  = new Product("Яйца", 10.0, Units.PIECES, FreshStatus.FRESH,"25.04.2019", Category.EGGS);
        p[1]  = new Product("Капуста", 0.6, Units.KILOS, FreshStatus.NOT_FRESH,"08.04.2019", Category.FRUITS);
        p[2] = new Product("Кола", 0.2, Units.LITERS, FreshStatus.NOT_FRESH,"10.04.2019", Category.DRINKS);
        p[3]   = new Product("Говядина", 1.2, Units.KILOS, FreshStatus.FRESH,"22.04.2019", Category.MEAT);
        p[4] = new Product("Молоко", 0.5, Units.LITERS, FreshStatus.FRESH,"20.04.2019", Category.MILK);
        p[5]  = new Product("Кефир", 1.0, Units.LITERS, FreshStatus.FRESH,"19.04.2019", Category.MILK);


        for (int i = p.length - 1; i >= 0; i--)
        {
            System.out.println(p[i]);
        }


        //Date objDate = new Date();
        //String strDateFormat = "dd.MM.yyyy";
        //SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        //System.out.println(objSDF.format(objDate));

    }

    //МЕТОД ДОБАВЛЯЕТ СТРОКУ-РАЗЛЕИТЕЛЬ
    public static void LINE(){
        System.out.println("--------------------------------------------------------------------------------------");
    }
    //МЕТОД ДПИСЫВАЕТ ПРОБЕЛЫ, ЕСЛИ ДЛИНА ТЕКСТА МЕНЬШЕ ЗАДАННОЙ
    public static String padString(String str, int leng) {
        for (int i = str.length(); i <= leng; i++)
            str += " ";
        return str;
    }


}
