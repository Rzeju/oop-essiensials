package pl.excercise.java_zaawansowana_programowanie.zad9;

import pl.excercise.java_zaawansowana_programowanie.zad9.zad10.Movable;
import pl.excercise.java_zaawansowana_programowanie.zad9.zad10.MoveDirection;

public class Point2D implements Movable {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        x = x + moveDirection.getX();
        y = y + moveDirection.getY();
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
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
