package pl.code_cool.classes.inner_classes.zad6;

public class Zoo {

    private final Animal[] animals = new Animal[100];

    private class Animal {
        private String species;
        private String name;
        private int age;

        private Animal(String species, String name, int age) {
            this.species = species;
            this.name = name;
            this.age = age;
        }

        public String getSpecies() {
            return species;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public boolean addAnimal(String species, String name, int age) {
        Animal animal = new Animal(species, name, age);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }

        return false;
    }

    public void printAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Animal: " + animal.getSpecies() + " " + animal.getName() + " " + animal.getAge());
            }
        }
    }
}
