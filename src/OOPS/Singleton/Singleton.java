package OOPS.Singleton;

public class Singleton
{
    private Singleton(){

    }

    private static Singleton Instance;

    public static Singleton getInstance(){
        if(Instance == null){
            Instance = new Singleton();
        }
        return Instance;
    }

}
