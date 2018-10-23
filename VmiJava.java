package vmi.java;

public class VmiJava {

    void display() {
        System.out.println("java world");
    }

    public static void main(String[] args) {
        VmiJava v = new Child();
        v.display();
    }
}

class Child extends VmiJava {

    void display() {
        System.out.println("hello java");
    }
}
