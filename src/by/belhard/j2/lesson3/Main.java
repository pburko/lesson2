package by.belhard.j2.lesson3;

public class Main {
    public static void main(String[] args) {

    String[] array = new String[3];

    array[0] = "value 1";
    array[2] = "value 3";

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);

    String[] array2 = new String[]{"val1","val2","val3","val4"};
        array2[0] = "value 1";
        array2[2] = "value 3";

        for (int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

        for (String s: array) {
            System.out.println(s);
        }

        //Двумерный массив
        String[][] array3 = new String[3][];
        array3[0] = new String[3];
        array3[1] = new String[2];
        array3[2] = new String[1];

        for (String[] ar : array3) {
            for (String s : ar) {
                s = "a";
                System.out.printf("%3s", s);
            }
            System.out.println();
        }
    }

}
