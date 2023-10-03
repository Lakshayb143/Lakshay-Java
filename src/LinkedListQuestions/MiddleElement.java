package LinkedListQuestions;

import java.util.ArrayList;


public class MiddleElement
{
    public static void main(String[] args)
    {
        MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);


        System.out.println(middleNode(list));
        System.out.println(middle(list));


    }

    public static <T> MySinglyLinkedList.Node<T> middle(MySinglyLinkedList<T> list){
        ArrayList<T> ans = new ArrayList<>();

        MySinglyLinkedList.Node<T> head = list.head;

        while(head!=null){
            ans.add(head.element);
            head = head.next;
        }

        int mid = ans.size()/2;
        T value = ans.get(mid);

        return list.findNode(value);
    }


    public static <T> MySinglyLinkedList.Node<T> middleNode(MySinglyLinkedList<T> list){


        MySinglyLinkedList.Node<T> fast = list.head;
        MySinglyLinkedList.Node<T> slow = list.head;


        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }






}
