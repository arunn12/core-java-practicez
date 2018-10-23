package pkgthis.java;

public class ThisJava {

    int result = 100;

    void display() {
        int result = 50;
        System.out.println(this.result + "" + result);
    }

    public static void main(String[] args) {
        ThisJava s = new ThisJava();
        s.display();
    }
}
