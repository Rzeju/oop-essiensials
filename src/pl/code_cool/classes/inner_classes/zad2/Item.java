package pl.code_cool.classes.inner_classes.zad2;

public class Item {

    private String name;
    private double price;
    private int numberOfItems;

    public Item(String name, double price, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.numberOfItems = numberOfItems;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
