package by.belhard.j2.lesson2;

public class Main {


    public static void main(String[] args) {
        int x, i;
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
            System.out.println("Результат примера №6 = " + l);
        }
    }
}
