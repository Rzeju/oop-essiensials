package pl.excercise.java_zaawansowana_programowanie.zad17.zad17interface;

public class Main {

    public static void main(String[] args) {

        double result = ConversionType.CENTIMETERS_TO_INCHES.getConverter().convert(100);
        System.out.println(result);

        result = ConversionType.METERS_TO_YARDS.getConverter().convert(200);
        System.out.println(result);
    }
}
