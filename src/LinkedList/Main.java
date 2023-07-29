package LinkedList;

public class Main
{
    public static void main(String[] args) throws Exception {
        CustomSinglyLinkedList<Integer> list  = new CustomSinglyLinkedList<>();
        try{
            list.insertAt(23,2);
        }catch (Exception x) {
            System.out.println(x.getMessage());
        }
       ;
        list.insertFirst(2);
        list.insertFirst(1);

        list.insertLast(3);
        list.insertLast(4);

//        list.insertAt(5,2);
//        System.out.println(list.getSize());
        list.display();
//        int a = list.removeFirst();
//        int b = list.removeFirst();
//        list.display();
//        System.out.println(a + " " + b);

//        list.removeAt(2);

//        System.out.println(list.getNode(3));
        int index = list.getSize();
        list.insertAt(5,index-1);
        list.display();


    }
}