package LambdaFunctions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;


public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        Consumer<Integer> square = (ar) -> System.out.println("square is = " + ar*ar);
        square.accept(num);


        // Using custom functional interface
        Operation sum = (a,b) -> a+b;
        Operation product = (a,b) -> a*b;
        Operation subrtract = (a,b) -> a-b;


        BinaryOperator<Integer> add = (a,b) -> a+b;
        int result = add.apply(3,4);

        // Also
        IntBinaryOperator add2 = (a,b) -> a+b;
        int ans = add2.applyAsInt(3,4);



        // Using a method reference
        BinaryOperator<Integer> add3 = Main::addition;
        int apply = add3.apply(5, 10);

        Main myCalculator = new Main();
        myCalculator.operate(3,4,sum);
        myCalculator.operate(3,4,subrtract);


    }
    public static int addition(int a ,int b){
        return a+b;
    }

    private int operate(int a , int b , Operation op){
        return op.operation(a,b);
    }


}

interface Operation{
/*
    `A functional interface is an interface that contains only one abstract method.
    They can have only one functionality to exhibit.
    From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
    A functional interface can have any number of default methods
     */

    int operation(int a , int b);
}
