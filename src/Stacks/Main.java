package Stacks;

public class Main
{
    public static void main(String[] args)
    {
//        CustomStack<Integer> stack = new CustomStack<>(5);
//        for(int i = 1 ; i <=5 ; i++){
//            stack.push(i*2);
//        }
//        System.out.println(stack.size);
//        System.out.println(stack.length());
//        System.out.println(stack.pop());
//
//        System.out.println(stack);
//
//        System.out.println(stack.pop());System.out.println(stack.pop());
//
//        System.out.println(stack);


        DynamicStack<Integer> list = new DynamicStack<>(5);

        for(int i = 1; i <=25; i++){
            list.push(i);
        }

        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            System.out.println(list.pop());
        }

        System.out.println(list);


    }


}