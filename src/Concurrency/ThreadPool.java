package Concurrency;

import java.util.concurrent.*;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class ThreadPool
{
    public static void main(String[] args)
    {
        // For notes , refer the notion
        // Here it will create a pool of 10 threads , which will be uses again and again for performing tasks parallel.
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for(int i = 1 ; i <= 100 ; i++){
            NumberPrinter np = new NumberPrinter(i);
            executor.submit(np);
        }
        executor.close();
    }
}
