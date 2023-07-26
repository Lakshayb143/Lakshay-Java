package Stacks;

import java.util.Arrays;

public class CustomStack<E>
{
    protected Object[] data;

    private static final int DEFAULT_STACK_SIZE = 20;

     protected int size = 0;

    public CustomStack(){
        this(DEFAULT_STACK_SIZE);
    }

    public CustomStack(int n){
        this.data = new Object[n];
    }

    public int length(){
        return size;
    }

    public boolean isFull(){
        return size == data.length;

    }

    public boolean isEmpty(){
        return size == 0;

    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
//        Object ans = data[size-1];
//        data[size-1] = null;
//        size--;
//        return ans;
        Object ans = data[size-1];
        data[--size] = null;
        return ans;

    }


    public boolean push(E element){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        data[size] = element;
        size++;
        return true;

    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }
        return data[size-1];
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}