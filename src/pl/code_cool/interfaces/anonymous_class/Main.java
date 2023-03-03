package pl.code_cool.interfaces.anonymous_class;

import pl.code_cool.interfaces.Vehicle;

import java.util.Comparator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle() {
            @Override
            public void drive(int speed) {

            }

            @Override
            public void stop() {

            }
        };

        System.out.println(myVehicle.getClass().getName());


        Comparator<Integer> comparable = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        System.out.println(comparable.compare(10, 15));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 6;
            }
        };

        System.out.println(predicate.test("Hello"));
    }
}
