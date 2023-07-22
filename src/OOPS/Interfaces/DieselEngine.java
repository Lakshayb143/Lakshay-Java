package OOPS.Interfaces;

public class DieselEngine  implements  Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Diesel Engine is stopping");

    }

    @Override
    public void accelerate() {
        System.out.println("Diesel Engine is accelerating");

    }
}
