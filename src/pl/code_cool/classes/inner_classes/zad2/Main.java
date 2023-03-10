package pl.code_cool.classes.inner_classes.zad2;

public class Main {

    public static void main(String[] args) {

        Item item1 = new Item("Cup", 10, 2);
        Item item2 = new Item("Book", 20, 1);
        Item item3 = new Item("Cola", 5, 5);

        Customer customer = new Customer("Piotr", 30);
        Customer.ShoppingCart shoppingCart = customer.new ShoppingCart();

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);

        System.out.println(shoppingCart.getTotalPrice());
        System.out.println(shoppingCart.getCustomerName());

        shoppingCart.deleteItem(item2);
        System.out.println(shoppingCart.getTotalPrice());
    }
}
