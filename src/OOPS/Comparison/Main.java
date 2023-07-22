package OOPS.Comparison;

import java.util.Arrays;
import java.util.Comparator;

public class Main
{

    public static void main(String[] args){

        Student lakshay = new Student(57,"Lakshay",98.34f);
        Student vishesh = new Student(140,"Vishesh",99.34f);
        Student Rahul = new Student(33,"Rahul",89.33f);
        Student pragya = new Student(99,"Pragya",92.23f);


        Student[] list = {lakshay,vishesh,Rahul,pragya};

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));




//        // Also,
//        Arrays.sort(list,new Comparator<Student>());


        if((lakshay.compareTo(vishesh)) > 0){
            System.out.println("Vishesh roll no comes first.");
        }

        if((vishesh.compareTo(lakshay)> 0)){
            System.out.println("Lakshay roll num comes first.");
        }
    }
}
