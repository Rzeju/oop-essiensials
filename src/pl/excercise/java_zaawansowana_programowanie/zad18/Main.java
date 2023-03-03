package pl.excercise.java_zaawansowana_programowanie.zad18;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("I7", "8Gb", "GeForce RTX 4090", "Dell", "XYZ");
        System.out.println(computer);

        Laptop laptop = new Laptop("I5", "4Gb", "GeForce RTX 3070", "Asus", "Nitro", 80);
        System.out.println(laptop);

        System.out.println(computer.equals(laptop));

        System.out.println(computer.hashCode());
        System.out.println(laptop.hashCode());

        laptop.setBatteryLevel(100);
        System.out.println(laptop.hashCode());
    }
}
