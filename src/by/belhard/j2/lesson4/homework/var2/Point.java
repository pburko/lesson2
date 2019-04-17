package by.belhard.j2.lesson4.homework.var2;

public class Point {
    private double x;
    private double y;

    public Point(double o, double y) {
        this.x = o;
        this.y = y;
    }

    public double calcDistance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Точка{" + "икс=" + x + ", игрик=" + y + '}';
    }
}