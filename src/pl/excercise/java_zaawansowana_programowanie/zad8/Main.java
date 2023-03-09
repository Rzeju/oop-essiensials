package pl.excercise.java_zaawansowana_programowanie.zad8;

public class Main {

    public static void main(String[] args) {

        Validator validator = new ValidatorImpl();

        Parcel parcel1 = new Parcel(35, 40, 50, 29.0f, false);
        System.out.println(validator.validate(parcel1));

        Parcel parcel2 = new Parcel(35, 40, 50, 15.0f, true);
        System.out.println(validator.validate(parcel2));

        Parcel parcel3 = new Parcel(100, 150, 200, 15.0f, true);
        System.out.println(validator.validate(parcel3));

        Parcel parcel4 = new Parcel(10, 40, 50, 10.0f, true);
        System.out.println(validator.validate(parcel4));

        Parcel parcel5 = new Parcel(30, 40, 50, 35.0f, false);
        System.out.println(validator.validate(parcel5));

        Parcel parcel6 = new Parcel(30, 40, 50, 25.0f, true);
        System.out.println(validator.validate(parcel6));

    }
}
