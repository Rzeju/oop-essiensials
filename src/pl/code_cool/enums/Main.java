package pl.code_cool.enums;

public class Main {

    public static void main(String[] args) {

        System.out.println(Roast.BLONDE);
        Roast[] myEnums = Roast.values();

        for(Roast roast : myEnums) {
            System.out.println(roast);
        }

        Roast roast = Roast.valueOf("BLONDE");
        System.out.println(roast);

//        Roast roast1 = Roast.valueOf("Nie ma");
//        System.out.println(roast1);

        System.out.println(Coffee.ESPRESSO.getMilk());
        System.out.println(Coffee.ESPRESSO.getMilk());
        System.out.println(Coffee.ESPRESSO);
    }
}
