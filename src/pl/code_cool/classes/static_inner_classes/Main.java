package pl.code_cool.classes.static_inner_classes;

public class Main {

    public static void main(String[] args) {

        OuterClass.InnerStaticClass innerStaticClass = new OuterClass.InnerStaticClass();

        innerStaticClass.printInnerClass();

        OuterClass.staticPrintOuterClass();
        OuterClass.InnerStaticClass.staticPrintInnerClass();
    }
}
