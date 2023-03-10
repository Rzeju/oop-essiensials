package pl.excercise.java_zaawansowana_programowanie.zad9;

import pl.excercise.java_zaawansowana_programowanie.zad9.zad10.Movable;
import pl.excercise.java_zaawansowana_programowanie.zad9.zad10.MoveDirection;

public class Main {

    public static void main(String[] args) {

        Point2D center1 = new Point2D(0, 0);
        Point2D circlePoint1 = new Point2D(1, 0);
        Circle circle1 = new Circle(center1, circlePoint1);

        System.out.println(circle1);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());

        Point2D center2 = new Point2D(0, 0);
        Point2D circlePoint2 = new Point2D(1, 1);
        Circle circle2 = new Circle(center2, circlePoint2);

        System.out.println(circle2);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getPerimeter());
        System.out.println(circle2.getArea());

        Point2D center3 = new Point2D(2, 1);
        Point2D circlePoint3 = new Point2D(-3, -4);
        Circle circle3 = new Circle(center3, circlePoint3);

        System.out.println(circle3);
        System.out.println(circle3.getRadius());
        System.out.println(circle3.getPerimeter());
        System.out.println(circle3.getArea());

        MoveDirection moveDirection = new MoveDirection(2, 5);
        circle1.move(moveDirection);

        System.out.println("Obiekt circle1 po metodzie move()");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(circle1);

        Movable movable = center1;
        movable = circle1;


        circle1.resize(3);

        System.out.println("Obiekt circle1 po metodzie resize()");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getArea());
        System.out.println(circle1);

    }
}
