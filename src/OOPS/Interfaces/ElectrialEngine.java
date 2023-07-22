package OOPS.Interfaces;

public class ElectrialEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electrical Engine is starting");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine is stopping");


    }

    @Override
    public void accelerate() {
        System.out.println("Electrical Engine is accelerating");


    }
}
