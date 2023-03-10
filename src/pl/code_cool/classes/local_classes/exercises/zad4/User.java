package pl.code_cool.classes.local_classes.exercises.zad4;

public class User {

    private String firstName;
    private String lastName;
    private String login;
    private String password;

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName, Validator validator) {
        if (validator.validate(firstName)) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName, Validator validator) {
        if (validator.validate(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator validator) {
        if (validator.validate(login)) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator validator) {
        if (validator.validate(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
