import java.util.Scanner;

public class Break_and_Continue
{
	public static void main(String[] args)
	{	// Break and continue using Loops .

		/*
		break statement --> The break statement is used to exit the loop  irrespective  of whether  the condition  is true or false.
							Whenever a  break is encountered inside the loop , the control is sent  outside the loop.

		

		// break in for loop.

		for (int i = 0 ; i<= 10 ; i++)
		{	System.out.println(i);
			System.out.println("Java is Great.");

			if (i == 6)
			{	System.out.println("Loop exits here");
				break;
			}

		}
		



		// break in while loop.
		int var = 0;
		
		while ( true )
		{	System.out.println(var);
			//var++;
			if (var == 20)
			{	System.out.println("Exiting the loop as the value reaches 20");
				break;
			}
			var++;
		}


		// Same can be done on do while loop

		char c = 'a';
		
		do
		{	System.out.println(c);
			c++;

			if (c=='m')
			{	System.out.println("Exiting the loop as the value reaches 'm' ");
				break;
			}
		}while(true);
		
		*/

		// Continue Statement --> The continue statement is used to to immidiately move to the next iteration of the loop
		// The control is taken to the next iteration , thus skipping everything below "continue" statement inside the loop for that iteration.	

		for(int i = 1 ; i<= 20 ; i++)
		{	if ( i==5 || i ==10 || i ==15)
			{	System.out.println("Contine to next iteration .");
				continue;
			}
			System.out.println(i);
		}



		int i = 0;
		while(i<=20)
		{	i++;
			if ( i==6 || i ==12 || i ==18)
			{	System.out.println("Contine to next iteration .");
				continue;
			}

			System.out.println(i);
		}

		// In a nut shell
		// break statement completely exits the loop.
		// Continue statement skips the particular iteration of the loop.


	}

}