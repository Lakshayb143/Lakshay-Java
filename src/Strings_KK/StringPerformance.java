package Strings_KK;

public class StringPerformance
{
    public static void main(String[] args)
    {

        String series = "";

        for (int i = 0; i < 26; i++) {
            char alphabet = (char)('a'+i);
            series +=alphabet;


        }

        // above loop is not an efficient method
        // For solving the problem we will use StringBuilder
        System.out.println(series);

    }
}
