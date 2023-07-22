package Questions;

public class EvenDigits
{
    public static void main(String[] args)
    {
        int[] array = {1,3,4,12,4343,999999,432};
//        System.out.println(evenDigit(array));
//        System.out.println(evenDigits(array));
//        System.out.println(digits2(100));
//        System.out.println((int)(Math.log10(90)));
        System.out.println(digits(100000));
    }
//    Given an array nums of integers,
//    return how many of them contain an even number of digits.



//    Method 1
    static  int evenDigit(int[] nums)
    {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if(Integer.toString(nums[i]).length()%2==0){
                even++;
            }

        }
        return even;
    }


    // Method 2
    static int evenDigits(int[] nums)
    {
        int count = 0;
        for(int element : nums){
            if(even(element)){
                count++;
            }
        }
        return count;
    }

     static boolean even(int element) {

        int numberOfDigits = digits(element);
        return numberOfDigits%2==0;
    }

    static int digits(int num)
    {
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        int a = 0;
        while(num>0){
            a++;
            num = num/10;
        }

        return a;
    }

    // More optimized way to count number of digits
    static int digits2(int num)
    {
        return (int)(Math.log10(num)) + 1;
    }

}
