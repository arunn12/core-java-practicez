package deadlok;

public class Deadlok {

    public static void main(String[] args) {
        final String resource1 = "index 1";
        final String resource2 = "index 2";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }

                }
            }
        };

        t1.start();
        t2.start();
    }
}
