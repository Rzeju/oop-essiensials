package pl.code_cool.abstraction;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Pies", "Piotr");

        dog.giveVoice();
        System.out.println(dog.getLatinName());

        Animal animal = dog;

        animal.giveVoice();

        Lion lion = new Lion("My lion", "walking", "yellow");
        lion.drink();
        lion.giveVoice();

        Mammal mammal = lion;
        mammal.drink();
        mammal.giveVoice();

        animal = lion;
        animal.giveVoice();

        animal = dog;
        animal.doSomething();
        Dog newDog = dog;
        newDog.doSomething();

    }
}
