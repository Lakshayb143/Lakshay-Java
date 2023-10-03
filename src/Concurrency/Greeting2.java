package Concurrency;

public class Greeting2 extends Thread
{
    private String name;
    public Greeting2(String name){
        this.name = name;

    }

    @Override
    public void run() {
        System.out.println("Hello " + this.name + ". How are you?" + " From thread : " + Thread.currentThread().getName());
    }
}
