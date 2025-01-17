class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating two thread objects
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Starting both threads
        thread1.start();
        thread2.start();
    }
}
