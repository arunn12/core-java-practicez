package in;

interface Car {

    void drive();

    void speed();
}

public class In implements Car {

    public void drive() {
        System.out.println("am driving");
    }

    public void speed() {
        System.out.println("my speed-60");
    }

    public static void main(String[] args) {
        Car c = new In();
        c.drive();
        c.speed();
    }
}
