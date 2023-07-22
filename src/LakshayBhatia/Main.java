package LakshayBhatia;

public class Main
{
    public static void main(String[] args)
    {
        CustomArrayList<Integer> list = new CustomArrayList<>();
//        System.out.println(CustomArrayList.length);

        for (int i = 0; i < 10; i++) {
            list.add(i*2);

        }

//        System.out.println(list.get(0));
//        CustomArrayList<String> list2 = new CustomArrayList<>();
//        list2.add("String");
//        list2.add(String.valueOf(34));
//
//        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.size());

//        int index = list.size() - 1;
//        System.out.println(list.get(index));

//        list.add(20);
//        System.out.println(list);
        System.out.println("Removed element = " + list.pop());
        System.out.println(list.size());
//        System.out.println(list);

        WildCard<Integer> data = new WildCard<>(); // Cannot take String , Boolean as type of arraylist.



    }
}
