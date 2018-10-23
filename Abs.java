package abs;

abstract class Abs {

    abstract void drive();

    public static void main(String[] args) {
        Abs a = new Audi();
        a.drive();
    }

}

class Audi extends Abs {

    void drive() {
        System.out.println("i am driving");
    }
}