package OOPS.Interfaces;

public class Media implements MediaPlayer{

    @Override
    public void start(){
        System.out.println("Playing Music");

    }

    @Override
    public void stop(){
        System.out.println("Stopping the Music");

    }


    @Override
    public void song(){
        System.out.println("Playing Song.");

    }
}
