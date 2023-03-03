package pl.code_cool.abstraction;

public class Dog extends Animal {

    private String ownerName;

    public Dog(String latinName, String ownerName) {
        super(latinName);
        this.ownerName = ownerName;
    }

    public static void doSomething() {
        System.out.println("DOG");
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau, hau");
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
