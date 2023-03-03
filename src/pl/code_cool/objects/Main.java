package pl.code_cool.objects;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("Street Name", 1, 17);
        System.out.println(address.getStreetName());

        address.setStreetName("New Street Name");
        System.out.println(address.getStreetName());

        Person person1 = new Person("Name", "Surname", 30, address);
        System.out.println(person1.getAddress());

        Person person2 = new Person("Name3", "Surname2000", 30, address);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person1.equals(person2));
        System.out.println(person1);




    }
}
