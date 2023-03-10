package pl.code_cool.classes.inner_classes.zad6;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.addAnimal("Lion", "Charlie", 20);
        zoo.addAnimal("Dog", "Ruffy", 7);
        zoo.addAnimal("Cap", "Kitty", 12);
        zoo.addAnimal("Parrot", "Birdy", 20);
        zoo.addAnimal("Tortoise", "Ziggy", 100);

        zoo.printAnimals();
    }
}
