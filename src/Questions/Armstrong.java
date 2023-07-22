package Questions;

public class Armstrong
{
    public static void main(String[] args)
    {
        for(int i = 100; i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+ " ");

            }
        }


//        Output -> 153 370 371 407


    }

    static boolean isArmstrong(int num)
    {
        int original = num;
        int sum =0;
        while(num>0){
            int remainder = num%10;
            sum = sum + remainder*remainder*remainder;
            num = num/10;

        }
        return sum==original;
    }
}
