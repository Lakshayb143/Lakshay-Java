package LinkedList;

public class DoublyLL
{
    public static void main(String[] args) throws Exception
    {
        CustomDoublyLinkedList<Integer> list = new CustomDoublyLinkedList<>();

        list.insertFirst(2);
        list.insertFirst(1);

        list.insertLast(3);
        list.insertLast(4);

        list.insertAt(5,2);

//        list.display();
//        list.insertAt(5,2);
//        list.display();

//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());



        list.insertAfter(4,120);

//        list.display();
//
//        list.display(true);

        list.displayboth();

//        System.out.println(list.findNode(5));
//        System.out.println(list.findNode(2));
//        System.out.println(list.findNode(3));

//        System.out.println(list.removeLast());
//        list.display();
//        System.out.println(list.removeLast());
//        list.display();
//        System.out.println(list.removeLast());
//        list.display();
//        System.out.println(list.removeLast());
//        list.display();
//        System.out.println(list.removeLast());
//        list.display();
//        System.out.println(list.removeLast());


//        System.out.println(list.removeAt(2));
//        list.display();
//        System.out.println(list.removeAt(2));
//        list.display();





    }
}
