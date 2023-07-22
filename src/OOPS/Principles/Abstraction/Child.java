package OOPS.Principles.Abstraction;

/*
Option 1:
public abstract class Child extends Parent
{

}
*/

public class Child extends Parent
{
    float gpa;

    public Child(int num , String name , float gpa){
        super(num,name);
        this.gpa = gpa ;
    }
    public Child(){
        super();
        this.gpa = 0;
    }


    @Override
    void food(String name){
        System.out.format("The today food is %s",name);
    }

    @Override
    void greeting() {
        System.out.printf("Hello %s . How are you?",this.name);
    }
}
