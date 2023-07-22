package Enums;

public class Main
{
    public static void main(String[] args)
    {
        Months list  = Months.MARCH;
//        System.out.println(list);
        System.out.println(Months.valueOf("MARCH"));




//        System.out.println(list.getAbbreviation());

        for(Months month : Months.values()){
            System.out.println(month);
        }


        System.out.println(list.ordinal());
        list.hello();
        // ordinal() : It returns the position of declaration in enum
    }
}
