package Random;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomNumbers
{
    public static void main(String[] args)
    {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(Math.random());

        }

        System.out.println(average(list));


    }

    private static double average(ArrayList<Double> list) {
        double sum = 0;
        for(double element : list){
            sum  += element;
        }

        return  sum /list.size();
    }
}
