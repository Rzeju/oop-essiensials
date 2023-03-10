package pl.code_cool.classes.local_classes.exercises.zad1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    private static String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    public String[] validateEmails(String email, String alternativeEmail) {
        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty() || !validate(email)) {
                    this.email = "unknown";
                } else {
                    this.email = email;
                }
            }
        }

        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);

        System.out.println(email1.getClass().getName());
        System.out.println(email2.getClass().getName());

        return new String[] {email1.email, email2.email};
    }

    private static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.matches();
    }

    private static boolean validateNoRegex(String emailStr) {
        return emailStr.contains("@") && emailStr.contains(".");
    }


}
