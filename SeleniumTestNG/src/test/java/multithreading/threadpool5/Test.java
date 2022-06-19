package multithreading.threadpool5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int workers = 10;
        int boxesInTruck = 100;

        System.out.println("TRUCK WITH BOXES ARRIVED: [" + boxesInTruck + "]");
        System.out.println("READY WORKERS FOR WORK: [" + workers + "]");

        new Test().movedBoxesToStorage(workers, boxesInTruck);

        long endTime = System.currentTimeMillis();
        System.out.println("TOTAL TIME: " + (endTime-startTime)/1000 + " 'HOURS'");
    }

    public void movedBoxesToStorage(int workers, int boxes) {
        ExecutorService executorService = Executors.newFixedThreadPool(workers);
        for (int i = 0; i < boxes; i++)
            executorService.submit(new Work(i));
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ALL BOXES REMOVED");
    }
}

class Work implements Runnable {
    private int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("BOX № [" + id + "] MOVED TO STORAGE");
    }
}