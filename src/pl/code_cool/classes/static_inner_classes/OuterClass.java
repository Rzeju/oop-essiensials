package pl.code_cool.classes.static_inner_classes;

public class OuterClass {

    private static final String staticOuterClassField = "static outer class field";
    private final String outerClassField = "outer class filed";

    public static class InnerStaticClass {
            private static final String staticInnerClassFiled = "static inner class filed";
            private final String innerClassFiled = "inner class field";

            public void printInnerClass() {
                System.out.println(staticInnerClassFiled);
                System.out.println(innerClassFiled);

                System.out.println("From inner class " + staticOuterClassField);

//                staticPrintOuterClass();
//                staticPrintInnerClass();
            }

            public static void staticPrintInnerClass() {
                System.out.println(staticInnerClassFiled);
                System.out.println("From inner class " + staticOuterClassField);

//                staticPrintOuterClass();
            }
    }

    public void printOuterClass() {
        System.out.println(staticOuterClassField + " " + outerClassField);


//        staticPrintOuterClass();
//        InnerStaticClass.staticPrintInnerClass();
    }

    public static void staticPrintOuterClass() {
        System.out.println(staticOuterClassField);

//        InnerStaticClass.staticPrintInnerClass();

    }
}
