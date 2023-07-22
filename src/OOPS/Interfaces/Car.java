package OOPS.Interfaces;

public class Car implements  Engine , Brake , MediaPlayer
{

    @Override
    public void brake() {
        System.out.println("Stop the car!!");

    }

    @Override
    public void handBrake() {
        System.out.println("Apply the handbrake");

    }

    @Override
    public void start() {
        System.out.println("Engine is starting.");

    }

    @Override
    public void stop() {
        System.out.println("Engine is stopping");

    }

    @Override
    public void song() {
        System.out.println("Playing a song.");

    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");

    }
}
