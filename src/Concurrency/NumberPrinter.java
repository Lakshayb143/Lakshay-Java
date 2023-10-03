package Concurrency;

public class NumberPrinter implements Runnable
{
    private int num;
    public NumberPrinter(int val){
        this.num = val;
    }


    @Override
    public void run() {
        System.out.println("Number : " + this.num + " ,From thread : " + Thread.currentThread().getName());
    }
}
