package pkgfinally;

public class Finally {

    public static void main(String[] args) {
        try {
            int s = 25 / 5;
            System.out.println(s);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block always executed");
        }
        System.out.println("rest of the code");

    }
}
