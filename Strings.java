package strings;

public class Strings {

    public static void main(String[] args) {
        String a = "hello";
        String b = "world";
        String c = a + b;
        System.out.println(c);
        if (a.equals(c)) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }
        System.out.println(a.length());
    }
}
