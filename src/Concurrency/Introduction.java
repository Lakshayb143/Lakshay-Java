package Concurrency;

public class Introduction
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World! , From thread : " + Thread.currentThread().getName());
        Greeting obj = new Greeting("Lakshay");
        Greeting obj2 = new Greeting("Vishesh");
        Greeting obj3 = new Greeting("Krishna");



//
        Thread thread = new Thread(obj);
        Thread thread1 = new Thread(obj2);
        Thread thread2 = new Thread(obj3);
//
//        // start() method spawns a new thread and runs the run() method.
        thread.start();
        thread.join();
        thread1.start();
//        thread1.join();
        thread2.start();
//        thread2.join();

        // They will run on the current thread(main thread).
//        obj.run();
//        obj2.run();
//        obj3.run();


        // We have another method of implementing Multithreading.
        // We have done it in Greeting2.
        Greeting2 obj4 = new Greeting2("Lakshay");
        Greeting2 obj5 = new Greeting2("Vishesh");
        Greeting2 obj6 = new Greeting2("Krishna");

        obj4.start();
        obj5.start();
        obj6.start();



        // Here for each task , it created a new thread.
//        for(int i = 1 ; i <= 100 ; i++){
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);
//            t.start();
//        }

        // But is there a more efficient way of doing that?
        // check the ThreadPool class

    }

}

