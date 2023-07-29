package LinkedList;


import java.util.Arrays;

public class CustomDoublyLinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;

    private int size;

    public CustomDoublyLinkedList(){this.size = 0;}

    public void insertFirst(E value)
    {
        Node<E> newnode = new Node<>(value);
        if(head == null){
            newnode.next = newnode.prev = null;
            head = tail = newnode;
            size++;
            return;

        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        size++;
    }

    public void insertLast(E value)
    {
        if(size == 0){
            insertFirst(value);
            return;
        }
        Node<E> newnode = new Node<>(value,tail.next,tail);
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void insertAt(E value,int index){
        if(size == 0 || head == null || index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node<E> temp = getNode(index - 1);
        Node<E> newnode = new Node<>(value,temp.next);
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;

        size++;
    }

    public void insertAfter(E after , E value)
    {
        Node<E> node = findNode(after);
        if(node==null){
            System.out.println("Node doesn't exit");
            return;
        }
        Node<E> newnode = new Node<>(value,node.next);
        node.next = newnode;
        newnode.prev = node;
        if(newnode.next != null){
            newnode.next.prev = newnode;
        }else{
            tail = newnode;
        }

        size++;
        return;
    }

    public int getSize(){
        return size;
    }

    public E removeFirst() throws Exception
    {
        if(size == 0 || head == null){
            throw new Exception("Can't remove from a empty list");
        }

        E value = head.value;
        head.prev = null;
        head = head.next;

        size--;
        return value;
    }

    public Node<E> getNext(Node<E> eNode){
        return eNode.next;
    }

    public Node<E> getPrev(Node<E> e){
        return e.prev;
    }


    public E removeLast() throws Exception
    {
        if(size == 0 || head == null){
            throw new Exception("Can't remove from a empty list");
        }

        E value = tail.value;
        tail = tail.prev;
        if(tail!=null){
            tail.next = null;
        }
        size--;
        if(size==0){
            head = null;
        }

        return value;

    }

    public E removeAt(int index) throws Exception
    {
        if(size == 0 || head == null){
            throw new Exception("Can't remove from a empty list");
        }
        if(index==0){

            return removeFirst();
        }
        if(index==size -1){
           return removeLast();
        }
        Node<E> node = getNode(index-1);
        E value = node.next.value;
        node.next = node.next.next;
        node.next.prev = node;

        size--;

        return value;

    }


    public void display()
    {
        Node<E> node = head;
        while(node!=null){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public void display(boolean reverse)
    {
        if(reverse){
            Node<E> node = tail;
            while(node != null){
                System.out.print(node.value + "<-");
                node = node.prev;
            }
            System.out.println("START");
        }

    }

    public void displayboth(){
        // In this we will do it with single head variable.
        Node<E> node = head;
        Node<E> last = null;

        while(node != null){
            last = node;
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Displaying in Reverse Order");

        while(last != null){
            System.out.print(last.value + "<-");
            last = last.prev;
        }
        System.out.println("START");
    }

    public Node<E> getHead(){
        return head;
    }

    public Node<E> findNode(E value)
    {
        Node<E> node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node<E> getNode(int index)
    {
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }


    public Node<E> getTail(){
        return tail;
    }




    private class Node<E>
    {
        E value;
        Node<E> next;
        Node<E> prev;

        public Node(E value){
            this.value = value;
        }

        public Node(E value , Node next){
            this.value = value;
            this.next = next;
        }

        public Node(E value , Node next , Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
           Object[] arr = {this.prev.value,this.next.value};
           return "{ value = "+value+" ,data = " + Arrays.toString(arr);


        }

    }
}
