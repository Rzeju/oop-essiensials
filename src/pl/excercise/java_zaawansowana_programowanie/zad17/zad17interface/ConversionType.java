package pl.excercise.java_zaawansowana_programowanie.zad17.zad17interface;

public enum ConversionType {

    METERS_TO_YARDS(value -> 1.0936d * value),
    YARDS_TO_METERS(new ConverterI() {
        @Override
        public double convert(int value) {
            return 0.9144d * value;
        }
    }),
    CENTIMETERS_TO_INCHES(new ConverterI() {
        @Override
        public double convert(int value) {
            return 0.3937d * value;
        }
    }),
    INCHES_TO_CENTIMETERS(new ConverterI() {
        @Override
        public double convert(int value) {
            return 2.54d * value;
        }
    }),
    KILOMETERS_TO_MILES(new ConverterI() {
        @Override
        public double convert(int value) {
            return 0.6213 * value;
        }
    }),
    MILES_TO_KILOMETERS(new ConverterI() {
        @Override
        public double convert(int value) {
            return 1.6093 * value;
        }
    });

    private ConverterI converter;

    ConversionType(ConverterI converter) {
        this.converter = converter;
    }

    public ConverterI getConverter() {
        return converter;
    }
}
