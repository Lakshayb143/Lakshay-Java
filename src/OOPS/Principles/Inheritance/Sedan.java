package OOPS.Principles.Inheritance;

import javax.swing.border.EmptyBorder;

public class Sedan extends Car
{
    boolean EV;

    public Sedan(){
        this.EV = false;
    }

    public Sedan(boolean EV){
        super();
        this.EV = EV;
    }

    public Sedan(int price , int seats , boolean EV){
        super(price, seats); // Here, super is calling parent class(Car) constructor.
        // It is used to initialise values present in parent class.
        this.EV = EV;
    }

    public Sedan(Sedan old){
        super(old);
        this.EV = old.EV;
    }

//    ** NOTE **
//    In super() we pass a object of type Sedan not the type of Car for calling the constructor
//    But this still invokes the constructor of Car(Car old).
//    Reason : A superclass variable can refer to any subclass object derived from that class.
//    Thus, we are able to pass Sedan object to Car constructor and Obviously, Car only knows about its members.

    @Override
    public String toString() {
        return super.toString() + "This vehicle is Electrical = " + this.EV;
    }
}
