package training6.interviewquestions.async;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Async {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numProcessors = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Task task1 = new Task(1,2,1000);
        Task task2 = new Task(10,20,1000);

        Future<Integer> f1 = executorService.submit(task1);
        Future<Integer> f2 = executorService.submit(task2);


        System.out.println(f1.get() * f2.get());

        executorService.shutdown();

    }


    static class Task implements Callable<Integer> {
        int i1;
        int i2;
        int timer;

        public Task(int i1, int i2, int timer) {
            this.i1 = i1;
            this.i2 = i2;
            this.timer = timer;
        }

        @Override
        public Integer call() throws Exception {
            sleep(timer);
            return i1+i2;
        }
    }
}
