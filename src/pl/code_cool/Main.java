package pl.code_cool;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("Street Name", 1, 17);
        System.out.println(address.getStreetName());

        address.setStreetName("New Street Name");
        System.out.println(address.getStreetName());

        Person person = new Person("Name", "Surname", 30, address);
        System.out.println(person.getAddress());
    }
}
