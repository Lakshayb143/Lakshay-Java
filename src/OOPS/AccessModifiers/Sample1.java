package OOPS.AccessModifiers;

import java.security.PublicKey;

public class Sample1
{
    private int num;
    public String name;
    protected float gpa;
    int[] arr;

    public Sample1(int num,String name,float gpa){
        this.num = num;
        this.name = name;
        this.gpa = gpa;
        this.arr = new int[num];
    }

    public Sample1() {
        this.num = 0;
        this.name = null;
        this.gpa = 0.0f;
        this.arr = null;

    }

    public Sample1(String name){
        this.name = name;
    }

    public int getNum() {
        return num;

    }

    public void setNum(int num){
        this.num = num;
    }
}
