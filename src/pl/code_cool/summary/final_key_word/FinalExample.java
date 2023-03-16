package pl.code_cool.summary.final_key_word;

public class FinalExample {

    public static final String MY_CONSTANT = "My constant";
    public final String myFinalFiled = getString();

    public FinalExample(String myFinalFiled) {
       //pole final moze byc zainicjalizowane raz
       //moze byc to zrobione w konstruktorze lub metodą
    }

    public static String getString() {
        return "HEllo";
    }

    public final void print() {
        System.out.println("Nie można nadpisać tej metody");
    }
}
