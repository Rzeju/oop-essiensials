package pl.code_cool.interfaces;

public class Bike implements Vehicle {

    @Override
    public void drive(int speed) {
        System.out.println("My Bike is riding " + speed);
    }

    @Override
    public void stop() {
        System.out.println("My Bike is stoping");
    }
}
