package pl.code_cool.classes.inner_classes;

public class OuterClass {


    private final String outerClassField = "outer class filed";

    public class InnerClass {

        private final String innerClassFiled = "inner class field";

        public void printFiledInnerClass() {
            System.out.println(innerClassFiled);
            System.out.println("From inner class " + outerClassField);
            printFieldsOuterClass();
        }
    }

    public void printFieldsOuterClass() {
        System.out.println(outerClassField);
    }
}
