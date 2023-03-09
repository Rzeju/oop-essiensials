package pl.excercise.java_zaawansowana_programowanie.zad8;

public class ValidatorImpl implements Validator {

    @Override
    public boolean validate(Parcel input) {

        boolean sizeSum = input.getxLength() + input.getyLength() + input.getzLength() <= 300;
        boolean size = input.getxLength() >= 30 && input.getyLength() >= 30 && input.getzLength() >= 30;
        boolean express = (!input.isExpress() && input.getWeight() <= 30) || (input.isExpress() && input.getWeight() <= 15);

        return sizeSum && size && express;
    }
}
