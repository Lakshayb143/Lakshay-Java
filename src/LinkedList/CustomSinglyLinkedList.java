package LinkedList;

public class CustomSinglyLinkedList<E>
{
    private Node<E> head;
    private Node<E> tail;

    private int size ;

    public CustomSinglyLinkedList(){
        this.size = 0;
    }

    public void insertFirst(E value)
    {
        Node<E> newnode = new Node<>(value);
        newnode.next = head;

        head = newnode;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertLast(E element)
    {
        if(tail == null){
            insertFirst(element);
            return;
        }
        Node<E> node = new Node<>(element);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertAt(E element , int index) throws Exception {
        if(index > size){
            throw new Exception("Index out of bound!!");
        }
        if(index == 0){
            insertFirst(element);
            return;
        }if(index == size){
            insertLast(element);
            return;
        }
        Node<E> temp = head;

        for(int i = 1; i<index;i++){
            temp  = temp.next;
        }

        Node<E> newnode = new Node<>(element,temp.next);
        temp.next = newnode;

        size++;

    }

    public int getSize(){
        return size;
    }


    public E removeFirst() throws Exception
    {
        if(head == null){
            throw new Exception("List is Empty");
        }
        E value = head.element;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public E getHead() {
        return head.element;
    }

    public E getTail() {
        return tail.element;
    }

    public E removeLast() throws Exception
    {
        if(tail == null){
            throw new Exception("List is Empty");
        }
        if(size<= 1){
            return removeFirst();
        }
        E value = tail.element;
        Node<E> temp = getNode(size - 2);
        tail = temp;
        tail.next = null;

        size --;
        return value;
    }

    public E removeAt(int index) throws Exception
    {
        if(size == 0){
            throw new Exception("List is Empty");
        }
        if(index==0){
            removeFirst();
        }else if(index == size-1){
            removeLast();
        }

        Node<E> temp = getNode(index - 1);
        E value = temp.next.element;
        temp.next= temp.next.next;
        size--;
        return value;
    }


    public Node<E> getNode(int index)
    {
        Node<E> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public Node<E> findNode(E value)
    {
        Node<E> temp = head;
        while(temp != null){
            if(temp.element == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;

    }


    public void display()
    {
        Node<E> temp  = head;

        while(temp!=null){
            System.out.print(temp.element + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }



    public class Node<E>
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

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }
    
}