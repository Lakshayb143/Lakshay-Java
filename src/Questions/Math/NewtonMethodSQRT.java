package Questions.Math;

public class NewtonMethodSQRT
{
    public static void main(String[] args)
    {
        System.out.println(sqrt(40));

    }

    static double sqrt(double n) {
        double x = n;

        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.0000001) {
                break;
            }

            x = root;
        }

        return root;
    }
}
