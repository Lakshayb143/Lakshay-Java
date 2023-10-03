package LargeData;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class LargeDecimals
{
    public static void main(String[] args)
    {
        BigDecimal A = new BigDecimal("0.04");
        BigDecimal B = BigDecimal.valueOf(0.03);

        System.out.println(0.04-0.03);
        System.out.println(A.subtract(B));

        // operations
        // Same as BigInteger

    }
}
