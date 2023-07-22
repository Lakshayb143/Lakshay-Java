package Arrays_KK;

public class MaximumWealth
{
    public static void main(String[] args)
    {
        int[][] array = {{1,2,3},{5,2,1}};
        System.out.println(maximumWealth(array));

    }

    static int maximumWealth(int[][] arr)
    {
        int max = 0;
        for(int[] array : arr){
            int rowsum = 0;
            for(int element : array){
                rowsum += element;
            }
            if(rowsum>max){
                max = rowsum;
            }

        }

        return max;

    }
}
