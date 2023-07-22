package OOPS.Interfaces;

public class BetterCar
{
    private Engine engine = new DieselEngine();
    private Media player = new Media();

    public BetterCar(){

    }

    public BetterCar(Engine obj){
        this.engine = obj;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }

    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
