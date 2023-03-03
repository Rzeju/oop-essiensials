package pl.code_cool.abstraction;

public abstract class Animal {

    private String latinName;

    public Animal(String latinName) {
        this.latinName = latinName;
    }

    public abstract void giveVoice();

    public static void doSomething() {
        System.out.println("ANIMAL");
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
}
