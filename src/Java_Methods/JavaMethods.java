

public class JavaMethods
{
	public static void main(String[] args)
	{
		// This is a program for creating methods and using them.

		// Calling Sum without a class  instance because it's a static method.

		int s = Sum(100,20);
		System.out.println(s);

		// Calling percentage method by creating a class instance
		// Method invocation using object creation
	
		JavaMethods obj = new JavaMethods();
		int p = obj.percentage(100,100,100,100,90);
		System.out.println(p);	

	}
	static int Sum(int a , int b)
	{
		return a+b ;
	}


	int percentage( int a , int b ,int c , int d , int e)
	{
		int sum = a + b + c + d + e ;
		int percent = sum / 5 ;
		return percent ;
	}


}