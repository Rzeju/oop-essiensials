package pl.code_cool.classes.static_inner_classes.zad2;

public class Main {

    public static void main(String[] args) {

        String reversed = MyUtils.StringUtils.reverse("Hello");
        System.out.println(reversed);

        System.out.println(MyUtils.StringUtils.toLowerCase("lowerCasEWords"));
        System.out.println(MyUtils.StringUtils.toUpperCase("UpperCASEWordS"));
    }
}
