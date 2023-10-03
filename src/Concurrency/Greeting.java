package Concurrency;

public class Greeting implements Runnable
{
    private String name;
    public Greeting(String name){
        this.name = name;

    }

    @Override
    public void run() {
        System.out.println("Hello " + this.name + ". How are you?" + " From thread : " + Thread.currentThread().getName());
    }
}

