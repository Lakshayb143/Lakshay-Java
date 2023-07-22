package OOPS.Interfaces;

public class Main
{
    public static void main(String[] args)
    {
//        Car car = new Car();
//        car.code();

//        car.start();
//        car.song();
//        car.accelerate();
//        car.brake();
//        car.stop();

        MediaPlayer player = new Car();
//        player.stop();
        // Now  in above statement it is running the engine's stop();
        // I am asking to stop the music but it is stopping the engine.

        // To solve this problem we create separate classes for separate interfaces.

        BetterCar carr = new BetterCar();

//        carr.start();
//        carr.startMusic();
//
//        carr.upgradeEngine(new ElectrialEngine());
//        carr.start();






    }


}
