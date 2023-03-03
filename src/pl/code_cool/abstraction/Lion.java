package pl.code_cool.abstraction;

public final class Lion extends Mammal {

    private String color;

    public Lion(String latinName, String movementKind, String color) {
        super(latinName, movementKind);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void giveVoice() {
        System.out.println("Wrrrrraaaa");
    }

    @Override
    public void drink() {

        System.out.println("Siup siup");
    }
}
