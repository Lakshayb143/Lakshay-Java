package OOPS.Principles.Inheritance;

public class Mercedes extends Sedan
{

    char model ;

    public Mercedes(){
        super();
        this.model =  'S';

    }

    public Mercedes(int price , int seats , boolean EV , char model){
        super(price, seats, EV);
        this.model = model;
    }


    @Override
    public String toString() {
        return "Mercedes{" +
                "model=" + model +
                ", EV=" + EV +
                ", price=" + price +
                ", seats=" + seats +
                '}';
    }
}
