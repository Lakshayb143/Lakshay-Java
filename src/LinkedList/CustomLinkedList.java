package LinkedList;

import javax.swing.text.Element;

public class CustomLinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;



    private class Node<E>
    {
        private E element;
        private Node<E> next;

        public Node(E element){
            this.element = element;
        }

        public Node(E element , Node next){
            this.element = element;
            this.next = next;
        }

    }
}