package jpmorgan.interview;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Async {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        Task task1 = new Task(1,2, 1000);
        Task task2 = new Task(3,4, 1000);
        Task task3 = new Task(3,4, 1000);
        Task task4 = new Task(3,4, 1000);
        Task task5 = new Task(3,4, 1000);
        Task task6 = new Task(3,4, 1000);

        long start = System.currentTimeMillis();

        Future<Integer> result1 = executorService.submit(task1);
        Future<Integer> result2 = executorService.submit(task2);
        Future<Integer> result3 = executorService.submit(task3);
        Future<Integer> result4 = executorService.submit(task4);
        Future<Integer> result5 = executorService.submit(task5);
        Future<Integer> result6 = executorService.submit(task6);



        System.out.println(result1.get() * result2.get() + result3.get() + result4.get() + result5.get()+result6.get());

        long stop = System.currentTimeMillis();

        System.out.println();

        System.out.println(stop - start);

        executorService.shutdown();
    }

    static class Task implements Callable<Integer> {
        int i1;
        int i2;
        long sleepTime;
        Task(int i1, int i2, long sleepTime) {
            this.i1 = i1;
            this.i2 = i2;
            this.sleepTime = sleepTime;
        }


        @Override
        public Integer call() throws Exception {
            sleep(sleepTime);
            return this.i1 + this.i2;
        }
    }
}
