package Enums;

import OOPS.Cloning.Human;

public enum Months implements A{

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    // These are known as enum constants.
    // These are public , static , final
    // Since it's final , you can't create child enums
    // all these are of type Months

    final int NO_OF_MONTHS = 12;

    private int abbreviation;


    // Internally : public static final Months January = new Months(1);

    Months(int num) {
        this.abbreviation = num;
    }
    // this is not public or protected
    // This can only be private or default

    public int getAbbreviation(){
        return abbreviation;
    }


    @Override
    public  void hello() {
        System.out.println("Heloo");
    }
}
