package inheritance;

public class Inheritance {

    void display() {
        System.out.println("from parent class");

    }

    public static void main(String[] args) {
        Inheritance in = new Inheritance();
        Child c = new Child();
        in.display();
        c.disp();
    }
}

class Child extends Inheritance {

    void disp() {
        System.out.println("from child");
    }
}
