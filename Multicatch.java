package multicatch;

public class Multicatch {

    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("task1 completed");
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("task compressed");
        }

        System.out.println("rest of code");
    }

}
