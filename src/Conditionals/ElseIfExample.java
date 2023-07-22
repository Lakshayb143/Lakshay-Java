import java.util.*;


public class ElseIfExample
{
	public static void main(String[] args)
	{
		// This java program is for elseif conditionals.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your marks = ");
		int marks = scan.nextInt();
	
		if (marks>=90)
			{	System.out.println("A Grade.Buddhi bhot tezz hai tumhari..!!");
			}
		else if(marks>=80)
			{ 	System.out.println("B Grade.Shabash Munna bhot badiyaa beta..!!");
			}
		
		else if(marks>=70)
			{	System.out.println("C Grade.Or chala bhai mobile..!!");
			}
		
		else if(marks>=60)
			{	System.out.println("D Grade.Paisa barbad..!!");
			}
		
		else
			{	System.out.println("Kuch nahi karoge tum .....Sirf khaaoge or Hagoge");
			}
	}

}