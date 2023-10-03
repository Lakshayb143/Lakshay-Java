package LargeData;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomString
{

    static String randomString(int length)
    {
        StringBuffer str = new StringBuffer(length);
        Random num = new Random();

        for (int i = 0; i < length; i++) {
            char ch = (char)(97+num.nextInt(26));
            str.append(ch);
        }

        return str.toString();
    }
}
