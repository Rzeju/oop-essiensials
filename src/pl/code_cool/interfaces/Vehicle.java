package pl.code_cool.interfaces;

public interface Vehicle {

    int size = 5;

    void drive(int speed);
    void stop();

    default void someDefaultMethod() {
        System.out.println("My default method");
    }

    static int someStaticMethod() {
        return size;
    }
}
