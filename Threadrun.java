package threadrun;

public class Threadrun implements Runnable {

    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Threadrun s1 = new Threadrun();
        Thread t1 = new Thread(s1);
        t1.start();

    }
}
