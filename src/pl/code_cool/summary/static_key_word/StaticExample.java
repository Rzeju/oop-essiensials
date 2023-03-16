package pl.code_cool.summary.static_key_word;

import pl.code_cool.summary.access_modificators.Modificators;

public class StaticExample {

    public static int number = 10;
    public Modificators modificators;

    public static int getNumber() {
        return number;
    }

    static {
        number = 100;
        getNumber();
    }

    {
        Modificators modificators2 = new Modificators();
        modificators = modificators2;
        number = 20;
        getNumber();
        doSomething();
    }

    public void doSomething() {

    }
}
