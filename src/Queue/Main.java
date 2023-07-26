package Queue;

public class Main
{
    public static void main(String[] args)
    {
        CustomQueue<Integer> list = new CustomQueue<>(5);

        for(int i = 1 ; i <=5 ; i++){
            list.insert(i);
        }
//        list.display();

//        System.out.println(list.end);

//        System.out.println(list.remove());
//        System.out.println(list.remove());
//        System.out.println(list);

//        CircularQueue<Integer> list2 = new CircularQueue<>(5);
//        for(int i = 1 ; i <=5 ; i++){
//            list2.add(i);
//        }
//        list2.display();
//
//        list2.remove();
//        list2.remove();
//        list2.remove();
//
//        list2.display();
//
//        list2.add(6);
//        list2.add(7);
//        list2.add(8);
//
////        System.out.println(list2);
//        list2.display();

        DynamicQueue<Integer> list3 = new DynamicQueue<>(2);
        for(int i = 1 ; i <=5 ; i++){
            list3.add(i);
        }

        System.out.println(list3);
        System.out.println(list3.front + " " + list3.end);
        list3.display();

        list3.remove();
        list3.remove();
        list3.remove();
        list3.remove();
        System.out.println(list3.front + " " + list3.end);
        System.out.println(list3.size);

        list3.display();

        for(int i = 6 ; i <=15 ; i++){
            list3.add(i);
        }

        System.out.println(list3);
        list3.display();

//

    }
}