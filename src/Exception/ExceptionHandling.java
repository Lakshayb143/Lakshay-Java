package Exception;

public class ExceptionHandling
{
    public static void main(String[] args)
    {

        int a = 10;
        int b = 0;

//        try{
//            divide(a,b);
//        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }finally{
//            System.out.println("This will always execute!!");
//        }

        try{
//            int c = divide(a,b);
            throw new MyException("User created exception");
        }
//        catch(Exception exc){
//            System.out.println("Message"); // If we add above then all are caught already as this superclass
                                             //  that's why it is showing Exception 'java.lang.ArithmeticException' has already been caught
//        }
        catch(MyException | ArithmeticException n){
            System.out.println(n.getMessage());
        }
        catch(Exception exception){
            System.out.println("Another exception");
            System.out.println(exception.getMessage());
        }

    }

    static int divide(int a , int b) throws ArithmeticException
    {
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero.");
        }

        return a/b;
    }
}
