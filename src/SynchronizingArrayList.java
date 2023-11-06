import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizingArrayList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> safeArrayList = Collections.synchronizedList(new ArrayList<Integer>()) ;
        safeArrayList.add(1);
        safeArrayList.add(2);
        safeArrayList.add(3);
    

        // create a thread pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // create a runnable task that increase the element in the array list by one
        Runnable task = () -> {
            incrementArrayList(safeArrayList);
        };

        // Submit the task to the executor service 100 times.
        // All the tasks will modify the ArrayList concurrently
        for(int i = 0; i < 100; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(safeArrayList);
    }

    // Increment all the values in the ArrayList by one
    private static void incrementArrayList(List<Integer> safeArrayList) {
        for(int i = 0; i < safeArrayList.size(); i++) {
            Integer value = safeArrayList.get(i);
            safeArrayList.set(i, value + 1);
        }
    }
}

