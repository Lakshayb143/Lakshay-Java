package LinkedList;

import java.util.List;

public class CircularLinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;

    private int size;

    public CircularLinkedList()
    {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insert(E value)
    {
        Node<E> newnode  = new Node<>(value);
        if(head==null){
            head = tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        newnode.next = head;
        tail = newnode;
        size++;
        return;

    }

    public E removeTail()
    {
        if(head == null){
            return null;
        }
        E value = tail.value;
        Node<E> temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = head;
        size--;
        return value;
    }

    public E removeHead(){
        if(head == null){
            return null;
        }
        E value = head.value;
        if(size==1){
            head = tail = null;
            size--;
            return value;
        }

        tail.next = head.next;
        head = head.next;
        size--;

        return value;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void remove(E value)
    {
        if(head == null){
            return ;
        }
        Node<E> temp = head;
        if(temp.value == value){
            removeHead();
            return;
        }
        while(temp.next.value != value){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
        return;


    }

    public void display(){
        Node<E> node = head;
        if(node==null){
            System.out.println("END");
            return;
        }
     do{
         System.out.print(node.value+"->");
         node = node.next;
     }while(node!=head);
        System.out.println("HEAD");

    }

    private class Node<E>{
        E value;
        Node<E> next;

        public Node(E value){
            this.value = value;
        }


        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next.value +
                    '}';
        }
    }


    public static void main(String[] args){
        CircularLinkedList<Integer> list = new CircularLinkedList<>();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.display();

        list.remove(1);

        list.display();
    }
}
