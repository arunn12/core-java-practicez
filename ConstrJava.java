package constr.java;

public class ConstrJava {

    public ConstrJava() {
        System.out.println("parent class constr");
    }

    public static void main(String[] args) {
        ConstrJava j = new ConstrJava();
        Child c = new Child();

    }

}

class Child extends ConstrJava {

    public Child() {
        System.out.println("child class conster");
    }
}
