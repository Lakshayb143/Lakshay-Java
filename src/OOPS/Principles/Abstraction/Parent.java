package OOPS.Principles.Abstraction;

public abstract class Parent
{
    int num;
    String name;
    int[] arr;

    public Parent() {
        int num = 0;
        String name = null;
        int[] arr = null;

    }

    public Parent(int num , String name){
        this.num  = num;
        this.name = name;
        int[] arr = new int[num];
    }

    abstract void food(String name);

    void greet(){
        System.out.printf("Hello %s",this.name);
    }

    abstract void greeting();
}
