package by.belhard.j2;

public class Main {

    public static void main(String[] args) {
//----------
//ЗАДАЧА №1
/*Есть целочисленная переменная x, если удвоенное значение x больше, чем 20,
товывести x, если меньше, то вывести -x, если равно, то вывести 0; */
//РЕШЕНИЕ
        System.out.println("Задача №1");
        int x = 35;
        x = x * 2;

        if (x > 20) {
            System.out.println("Результат 'x' т.к. 20 > " + x );
        }
        else if (x < 20) {
            System.out.println("Результат '-x' т.к. 20 < " + x );
        }
        else {
            System.out.println("Результат '0' т.к. 20 = " + x );
        }

//----------
//ЗАДАЧА №2
 //* 15 раз вывести на экран фразу «Это X-я строка», где вместо Х будет стоять порядковый номер строки. Начинаем счет строк с единицы.
//РЕШЕНИЕ
        System.out.println("Задача №2");
       for(int i=1; i <16; i++){
           System.out.println("Это " + i + "-я строка");
       }

//----------
//ЗАДАЧА №3
/*Есть переменная A. Вывести в консоль арифметическую последовательность, состоящую из А элементов, начиная с нуля, где каждый следующий элемент на А больше.*/
//РЕШЕНИЕ
        System.out.println("Задача №3");
        String elem_A = new String("");
        for(int a=0; a<60; a+=6){
            elem_A = elem_A + a +  " ";
        }
        System.out.println("Арифметическая последовательность элементов А: " + elem_A);

//----------
//ЗАДАЧА №4
/*Вывести на экран таблицу умножения для чисел от 2 до 9 в виде таблицы
Пример:
2  3  4   5   6   7   8   9
2  4  6  8 10 12 14 16 18
3  6  9 12 15…
4  8 12
5 10
И так далее…*/
//РЕШЕНИЕ
        System.out.println("Задача №4");

//----------





















        /*int x, i;
        x=22;
        i=3;

        //Пример №1 условного оператора If Else
       if (x==20) {
            x--;
        }
        else if (x==21){
            x++;
        } else {
            x /=2;
        }
        System.out.println("Результат примера №1 = " + x);

        //Пример №2 тернарного оператора (?) с присвоением результата переменной
        int y = (x % 2 == 0) ? (x / 2) : (-x);
        System.out.println("Результат примера №2 = " + y);

        //Пример №3 тернарного оператора (?) выводом результата на экран
        System.out.println("Результат примера №3 = " + ((x % 2 == 0) ? (x / 2) : (-x)));


        //Пример №4 цикла while
        while (i>0){
            System.out.println("Результат примера №4 = " + i);
            i--;
        }
        //Пример №5 цикла do
        do {
            System.out.println("Результат примера №5 = " + x);
            x--;
        }
        while (x==5);

        //Пример №6 цикла for
        for (int l = 0; l<=6; l+=2) {
            System.out.println("Результат примера №6 = " + l);}*/
        }

}
