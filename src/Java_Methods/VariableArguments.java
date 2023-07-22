
public class VariableArguments
{

	public static int sum(int ...array)
	{
		// Here all the arguments will be packed inside a array.
		// array is avaliable as int[] array.
	
		int answer = 0 ;
		
		for (int element : array)
		{
			answer += element; 
		}
		return answer;
	}

	public static void main(String[] args)
	{
		// This is a sample code.
		
		System.out.println(sum(1,2,3,4,5));




	}

}