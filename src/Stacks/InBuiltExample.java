package Stacks;

import java.util.*;

public class InBuiltExample
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.add(54);
        stack.add(43);
        stack.add(3);
        stack.add(2);
        stack.add(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}