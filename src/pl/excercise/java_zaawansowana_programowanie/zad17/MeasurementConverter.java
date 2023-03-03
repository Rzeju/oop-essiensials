package pl.excercise.java_zaawansowana_programowanie.zad17;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType) {
        if (conversionType.equals(ConversionType.METERS_TO_YARDS)) {
            return conversionType.getConverter().metersToYards(value);
        } else if (conversionType.equals(ConversionType.YARDS_TO_METERS)) {
            return conversionType.getConverter().yardsToMeters(value);
        } else if (conversionType.equals(ConversionType.CENTIMETERS_TO_INCHES)) {
            return conversionType.getConverter().centimetersToInches(value);
        } else if (conversionType.equals(ConversionType.INCHES_TO_CENTIMETERS)) {
            return conversionType.getConverter().inchesToCentimeters(value);
        } else if (conversionType.equals(ConversionType.KILOMETERS_TO_MILES)) {
            return conversionType.getConverter().inchesToCentimeters(value);
        } else {
            return conversionType.getConverter().milesToKilometers(value);
        }
    }
}
