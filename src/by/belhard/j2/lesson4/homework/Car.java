package by.belhard.j2.lesson4.homework;

public class Car {
    private String Name;
    private int x1, y1, x2 = x1*2, y2 = y1*2;
    private int distance;
    private double d1,d2;

   Car(String name, int x1, int y1, int distance) {
        this.Name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.distance = distance;
    }

    public String getName() {
        return Name;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getDistance() {
        return distance;
    }

    public void run(){

        x1=getX1();
        y1=getY1();
        x2=x1;
        y2=y1;

        System.out.println("Стартовая позиция " + getName() + ": x = " + x1 + "\t y = " + y1 + "\t Общий пробег: " + getDistance());

        while(true){
            x2 = x2 + 5;
            y2 = y2 + 3;
            d1=getDistance();

            String X = Integer.toString(x2);
            String Y = Integer.toString(y2);

            d2 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
            d2 = d2 + d1;

            String s;
            s="  Текущая позиция " + getName() + ": x = " + x2 + "\t y = " + y2 + "\t Общий пробег: " + Math.round(d2);
            System.out.print(s);

            for (int j = 0, k = s.length(); j < k; j++) {
                System.out.write('\b');
            }

            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
            }

        }


    }
}


