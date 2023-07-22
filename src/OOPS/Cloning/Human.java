package OOPS.Cloning;

public class Human implements Cloneable
{
    int age;
    String name;
    int[] arr;

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
        this.arr = new int[]{1,2,3,4,5};
    }

    public Human(int age , String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException
//    {
//        return super.clone();
//        // this is shallow copy
//
//    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        // It will do deep copy
        Human twin = (Human) super.clone(); // this is shallow copyting

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0 ; i< twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }

        return twin;

    }
}
