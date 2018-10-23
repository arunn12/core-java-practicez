package threads;

public class Threads extends Thread {

    @Override
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Threads t1 = new Threads();
        t1.start();
    }

}
