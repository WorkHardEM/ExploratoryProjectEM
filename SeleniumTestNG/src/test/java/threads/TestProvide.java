package threads;

public class TestProvide {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread.sleep(10000);

        MyThread myThread2 = new MyThread();
        myThread2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000l; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}
