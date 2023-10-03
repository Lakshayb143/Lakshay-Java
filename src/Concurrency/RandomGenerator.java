package Concurrency;
import java.util.concurrent.Callable;
import java.util.Random;
public class RandomGenerator implements Callable
{
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Integer num = random.nextInt(101);
        System.out.println("Number generated : " + num + " ,From thread : " + Thread.currentThread().getName());
        return num;

    }
}
