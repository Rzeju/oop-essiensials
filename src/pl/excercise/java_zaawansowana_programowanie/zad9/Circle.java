package pl.excercise.java_zaawansowana_programowanie.zad9;

public class Circle {

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
