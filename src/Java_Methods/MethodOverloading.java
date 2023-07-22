

public class MethodOverloading
{

	static void method()
	{
		System.out.println("Love you !!! ");
	}

	static void method(int a)
	{
		System.out.println("Love you " + a + " !!!");
	}

	static void method(String name)
	{
		System.out.println("Love you too " + name + " !!! ");
	}

	public static void main (String[] args)
	{
		// In Java, Two or more methods	can have the same name but they must have the different parameters 	
		// Such methods are called as Overloaded Methods.
		method();
		method(3000);
		method("Lakshay");

		// 	NOTE --> Method Overloading cannot be performed by changing the return type of methods.

		




	}


}