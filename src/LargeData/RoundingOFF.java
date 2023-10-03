package LargeData;

import java.text.DecimalFormat;

public class RoundingOFF
{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("000000000.00");
        System.out.println(df.format(3432.239332));
    }
}
