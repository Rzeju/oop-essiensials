package pl.code_cool.classes.local_classes.exercises.zad4;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        Validator nameValidator = new Validator() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        };

        Validator surnameValidator = new Validator() {
            @Override
            public boolean validate(String input) {
                return input != null && !input.isEmpty() && Character.isUpperCase(input.charAt(0));
            }
        };

        Validator loginValidator = new Validator() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        };

        Validator passwordValidator = new Validator() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        };

        user.setFirstName("tadeusz", nameValidator);
        user.setLastName("jóźwiak", surnameValidator);
        user.setLogin("123", loginValidator);
        user.setPassword("hehe", passwordValidator);

        System.out.println(user);

        user.setFirstName("Tadeusz", nameValidator);
        user.setLastName("Jóźwiak", surnameValidator);
        user.setLogin("Tadek12345", loginValidator);
        user.setPassword("hehe!", passwordValidator);

        System.out.println(user);

    }
}
