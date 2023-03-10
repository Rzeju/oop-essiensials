package pl.code_cool.classes.static_inner_classes.builder;

public class Main {

    public static void main(String[] args) {

        MyObject myObject = MyObject.builder()
                .setName("Name")
                .setNumber(10)
                .setIsObject(true)
                .setSecondName("SecondName")
                .build();

        System.out.println(myObject);
    }
}
