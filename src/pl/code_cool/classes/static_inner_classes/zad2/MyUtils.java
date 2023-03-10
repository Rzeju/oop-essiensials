package pl.code_cool.classes.static_inner_classes.zad2;

public class MyUtils {

    public static class StringUtils {

        public static String reverse(String string) {
            char ch;
            String reversed = "";
            for (int i = 0; i < string.length(); i++) {
                ch = string.charAt(i);
                reversed = ch + reversed;
            }

            return reversed;
        }

        public static String toLowerCase(String string) {
            return string.toLowerCase();
        }

        public static String toUpperCase(String string) {
            return string.toUpperCase();
        }
    }
}
