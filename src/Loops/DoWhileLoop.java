import java.util.Scanner;


public class DoWhileLoop
{
	public static void main(String[] args)
	{
		// This program is for do while loop

		/* do while loop --> This loop is similar to while loop except the fact that the minimum execution of do while loop is 1.
			
			while loop   	--> checks the condition & executes the code.
			do while loop	--> First executes the code & then checks the conditon for next time to run.

			Syntax for the do while loop:

					do{
						// Code/Statements will be written here.

					} while(condition);  ---> Note this semicolon.


		*/

		int i = 10;
		do{
			System.out.println(i);
			i++;
		}while(i<5);


		int a = 1;
		do{
			System.out.println(a);
			a++;
		}while(a<=100);

		// Printing n natural numbers using do while loop.
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		int x = 1;
		do{
			System.out.println(x);
			x++;
		}while(x<=n);
		




	}

}