package pl.code_cool.summary.static_key_word;

public class Main {

    public static void main(String[] args) {

        System.out.println(StaticExample.number);

        StaticExample staticExample = new StaticExample();
        System.out.println(StaticExample.number);
        StaticExample staticExample1 = new StaticExample();

        staticExample.number = 1000;

        System.out.println(StaticExample.number);
        System.out.println(staticExample.number);
        System.out.println(staticExample1.number);

        StaticExample staticExample2 = new StaticExample();
        System.out.println(StaticExample.number);

        System.out.println(StaticExample.getNumber());
        System.out.println(staticExample.getNumber());
    }
}
