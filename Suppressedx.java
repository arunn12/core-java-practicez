package suppressedx;

public class Suppressedx {

    public static void main(String[] args) {
        try {
            test();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    ;
public static void test() throws Exception {
        try {
            System.out.println("in try block");
            throw new NullPointerException("its from try block");

        } finally {
            System.out.println("in finally block");
            throw new NullPointerException("from finall block");
        }
    }

}
