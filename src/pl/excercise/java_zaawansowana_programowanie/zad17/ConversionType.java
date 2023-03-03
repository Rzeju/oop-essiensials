package pl.excercise.java_zaawansowana_programowanie.zad17;

public enum ConversionType {

    METERS_TO_YARDS(new Converter()),
    YARDS_TO_METERS(new Converter()),
    CENTIMETERS_TO_INCHES(new Converter()),
    INCHES_TO_CENTIMETERS(new Converter()),
    KILOMETERS_TO_MILES(new Converter()),
    MILES_TO_KILOMETERS(new Converter());

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }
}
