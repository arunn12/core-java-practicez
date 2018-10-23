package moverride;

public class Moverride {

    void display() {
        System.out.println("From parent class");
    }

    public static void main(String[] args) {
        Moverride mor = new Moverride();
        Child ch = new Child();
        mor.display();
        ch.display();
    }

}

class Child extends Moverride {

    void display() {
        String str1 = "hello";
        String str2 = "java";
        System.out.println(str1 + str2);
    }

}
