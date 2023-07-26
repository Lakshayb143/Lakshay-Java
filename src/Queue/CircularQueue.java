package  Queue;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class CircularQueue<E>
{
    public Object[] data;

    protected int front , end = 0;

    protected final  static int DEFAULT_SIZE = 10;
    protected int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new Object[size];
    }

    protected boolean isEmpty(){
        return size == 0;
    }

    protected boolean isFull(){
        return size == data.length;
    }

    public void add(E element){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        data[end++] = element;
        end %= data.length;
        size++;
    }

    public E remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return null;
        }
        E element = (E) data[front];
        front++;
        front %= data.length;
        size--;
        return element;
    }

    public E front(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return null;
        }
        return (E)data[front];
    }

//    Not working properly.
//    public void display(){
//        for(int i = front ; i <data.length ; i++){
//            System.out.print(data[i] + "<-");
//        }
//        System.out.println("END");
//    }


    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i]+ "<-");
            i++;
            i %= data.length;
        }while(i != end);

        System.out.println("END");
    }
    @Override
    public String toString(){
        return Arrays.toString(data);
    }

}