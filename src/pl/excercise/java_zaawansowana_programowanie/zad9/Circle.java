package pl.excercise.java_zaawansowana_programowanie.zad9;

import pl.excercise.java_zaawansowana_programowanie.zad9.zad10.Movable;
import pl.excercise.java_zaawansowana_programowanie.zad9.zad10.MoveDirection;
import pl.excercise.java_zaawansowana_programowanie.zad9.zad11.Resizable;

public class Circle implements Movable, Resizable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double doubleFactor) {
        double resizedPointX = center.getX() + ((point.getX() - center.getX()) * doubleFactor);
        double resizedPointY = center.getY() + ((point.getY() - center.getY()) * doubleFactor);

        point.setX(resizedPointX);
        point.setY(resizedPointY);
    }

    public Point2D[] getSlicePoints() {
        Point2D[] points = new Point2D[4];

        double radiusVectorX = point.getX() - center.getX();
        double radiusVectorY = point.getY() - center.getY();

        Point2D point3 = new Point2D(center.getX() - radiusVectorX, center.getY() - radiusVectorY);


         return null;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }
}
