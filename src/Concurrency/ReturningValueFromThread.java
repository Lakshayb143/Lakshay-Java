package Concurrency;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReturningValueFromThread
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService  threadPool = Executors.newFixedThreadPool(2);
        RandomGenerator g1 = new RandomGenerator();
        RandomGenerator g2 = new RandomGenerator();

        Future<Integer> r1 = threadPool.submit(g1);
        Future<Integer> r2 = threadPool.submit(g2);

        System.out.println("Sum is : " + (r1.get() + r2.get()));

    }
}
