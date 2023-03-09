package pl.code_cool.interfaces.double_methods;

public class MyClass implements InterfaceA, InterfaceB {

    @Override
    public void someMethod() {

    }

    @Override
    public void myDefault() {
        InterfaceA.super.myDefault();
        InterfaceB.super.myDefault();
        InterfaceC.someStatic();
    }
}
