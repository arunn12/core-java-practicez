package pkgsuper.java;

public class SuperJava {

    int fast = 50;

    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
    }
}

class Bike extends SuperJava {

    int fast = 100;

    void display() {
        System.out.println(super.fast);
    }
}
