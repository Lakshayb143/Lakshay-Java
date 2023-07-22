package OOPS.Introduction;

import java.util.Arrays;

public class IntroToOOPS
{
    public static void main(String[] args)
    {
        // Store the roll number of 5 students
        int[] roll = new int[5];

        // Store the name of 5 students
        String[] names = new String[5];

        // Store the data of 5 Students where each student has : {Roll no, names, marks}

        // Method 1: Create three different arrays for each attribute
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // but method 1 is not that efficient . The user wants to combine this to a single datatype.
        // This can be done using classes.
        //  A class is a named group of properties and functions

        Student[] students = new Student[5];

        // Method 2 : We will first create a class than we will create its instance
        Student lakshay; // Declaring a reference variable lakshay to object of type student.
//        System.out.println(Arrays.toString(students));

//        lakshay = new Student(); // Now lakshay is refering to object of class Student.
//        lakshay = new Student(57,"Lakshay Bhatia",99.2F) // This will give a error because
//                                                              by default constructor requires zero arguments.
        // After initialisation . Let's print lakshay.
//        System.out.println(lakshay);


        lakshay = new Student(57,"Lakshay",86.54f);
        // As we created our new constructor , now this will work

        System.out.println(lakshay.rollno);
        System.out.println(lakshay.name);
        System.out.println(lakshay.marks); // It's default value wil be printed.

        // Manipulating  the properties of class Student;

//        lakshay.rollno = 57;
//        lakshay.name = "Lakshay Bhatia";
//        lakshay.marks = 99.4F;

        // Accessing the properties of the object
//        System.out.println(lakshay.rollno);
//        System.out.println(lakshay.name);
//        System.out.println(lakshay.marks);


        // But the object is not created in the memory by above statement.



        Student random = new Student();

        System.out.println(random.name);


    }
}


// Created a class
// for every single student
class Student
{
    int rollno;
    String name;
    float marks = 100;

    // we need a way to add the values of above properties object by object.

    // we need one word to access every object.

    Student (int a , String b , float c){
        this.rollno = a ;
        this.name = b;
        this.marks = c;
    }

//    Student (){
//        this.rollno = 55 ;
//        this.name = "Random Name";
//        this.marks = 89.4f;
//
//    }

    Student(){
        // This is how we all constructor inside a constructor. (Using this keyword).
        this(100,"random",100.0f);
        // At execution , Internally the above statement will look like
//         new Student(100,"random",100.0f);
    }

    Student (Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

}


