package pl.excercise.java_zaawansowana_programowanie.zad17;

public class Main {

    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();

        double metersToYards = measurementConverter.convert(100, ConversionType.METERS_TO_YARDS);
        System.out.println(metersToYards);

        double inchesToCentimeters = measurementConverter.convert(100000, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(inchesToCentimeters);
    }
}
