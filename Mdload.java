package mdload;

public class Mdload {

    void sum(int a, int b) {
        System.out.println(a + b);

    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Mdload mo = new Mdload();
        mo.sum(10, 20, 30);
        mo.sum(10, 20);
    }
}
