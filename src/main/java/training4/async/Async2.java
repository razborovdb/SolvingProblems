package training4.async;

import java.util.concurrent.*;


public class Async2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Task task1 = new Task(1,2);
        Task task2 = new Task(3,4);

        Future<Integer> res1 = executorService.submit(task1);
        Future<Integer> res2 = executorService.submit(task2);

        System.out.println(res1.get() + res2.get());
        executorService.shutdown();
    }

    static class Task implements Callable<Integer> {

        int i1;
        int i2;

        Task(int i1 , int i2) {
            this.i1 = i1;
            this.i2 = i2;
        }
        @Override
        public Integer call() throws Exception {
            return i1+i2;
        }
    }

}
