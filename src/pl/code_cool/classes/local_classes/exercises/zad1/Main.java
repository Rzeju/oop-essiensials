package pl.code_cool.classes.local_classes.exercises.zad1;

public class Main {

    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        String[] results = userValidator.validateEmails("some", "hello123@gmail.pl");
        System.out.println(results[0] + ", " + results[1]);
        results = userValidator.validateEmails("hello@wp.pl", "hello_123@kommo.com");
        System.out.println(results[0] + ", " + results[1]);
    }
}
