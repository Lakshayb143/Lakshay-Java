package OOPS.Principles.Inheritance;

public class Car
{
    int price;
    int seats;
    final static int NumberOfWheels = 4;


    public Car(){
        this.price = 0;
        this.seats = 0;
    }

    public Car(int price, int seats) {
        this.price = price;
        this.seats = seats;
    }

    public Car(Car old){
        this.price = old.price;
        this.seats = old.seats;
    }

    public final void getinfo(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "price = " + price + " \n" ;

    }
}
