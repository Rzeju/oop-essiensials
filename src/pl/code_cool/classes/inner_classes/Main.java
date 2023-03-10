package pl.code_cool.classes.inner_classes;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        outerClass.printFieldsOuterClass();
        innerClass.printFiledInnerClass();

    }
}
