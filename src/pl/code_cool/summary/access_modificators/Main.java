package pl.code_cool.summary.access_modificators;

public class Main {

    public static void main(String[] args) {

        Modificators modificators = new Modificators();

        System.out.println(modificators.publicFiled);
        modificators.publicFiled = "new value public filed";
        System.out.println(modificators.publicFiled);

        System.out.println(modificators.defaultFiled);
        System.out.println(modificators.protectedFiled);
    }
}
