package multithreading.volatile2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(800);
        myThread.value = "[THREAD KILLING]";
        Thread.sleep(900);
        myThread.value = "[FUCK ... ]";
        Thread.sleep(900);
        myThread.value = "[THREAD KILLED] (X_x)";
        Thread.sleep(900);
        myThread.running = false;
    }
}

class MyThread extends Thread {

    public volatile boolean running = true;
    public volatile String value = "[HELLO THREAD] (O_o)";

    public void run() {
        while (running) {
            System.out.println(value);
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}