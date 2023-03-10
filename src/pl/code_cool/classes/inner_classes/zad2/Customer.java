package pl.code_cool.classes.inner_classes.zad2;

public class Customer {

    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public class ShoppingCart {

        private Item[] items = new Item[10];

        public boolean addItem(Item item) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = item;
                    return true;
                }
            }

            return false;
        }

        public boolean deleteItem(Item item) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null && items[i].getName().equals(item.getName())) {
                    items[i] = null;
                    return true;
                }
            }

            return false;
        }

        public double getTotalPrice() {
            double result = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null) {
                    result = result + items[i].getPrice() * items[i].getNumberOfItems();
                }
            }

            return result;
        }

        public String getCustomerName() {
            return getName();
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
