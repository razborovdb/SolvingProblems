package jpmorgan.interview;

import java.util.concurrent.*;

public record House() {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Add task1 = new Add(1,2);
        Add task2 = new Add(3,4);

        Future<Integer> result1 = executorService.submit(task1);
        Future<Integer> result2 = executorService.submit(task2);

        System.out.println(result1.get() * result2.get());

    }

    static class Add implements Callable<Integer> {
        int i1;
        int i2;
        Add(int i1, int i2) {
            this.i1 = i1;
            this.i2 = i2;
        }
        @Override
        public Integer call() throws Exception {
            return this.i1 + this.i2;
        }
    }


}
