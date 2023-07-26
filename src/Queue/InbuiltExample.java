package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class InbuiltExample
{
    public static void main(String[] args)
    {

//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(6);
//        queue.add(3);
//        queue.add(34);
//        queue.add(2);
//        queue.add(53);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deck = new ArrayDeque<>();
        //or
        Deque<Integer> deck2 = new LinkedList<>();

        deck.addFirst(34);
        deck.addLast(12);

        System.out.println(deck.removeFirst());

        System.out.println(deck);


    }

}