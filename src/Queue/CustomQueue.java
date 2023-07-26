package Queue;

import java.util.Arrays;

public class CustomQueue<E>
{
    private Object[] data;

    private static final int DEFAULT_QUEUE_SIZE = 20;

    private int end = 0;

    public CustomQueue(){
        this(DEFAULT_QUEUE_SIZE);
    }

    public CustomQueue(int size){
        this.data = new Object[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(E element){
        if(isFull()){
            return false;
        }
        data[end++] = element;
        return true;
    }

    public Object remove(){
        if(isEmpty()){
            return null;
        }
        Object removed = data[0];
        // Shift the elements towards left

        // My approach
        for(int i = 0 ; i < data.length ; i++){
            if(i == data.length -1 ){
                data[i] = null;
            }else{
                data[i] = data[i+1];
            }

        }

        // Site sol
//        for(int i = 1 ; i < end ; i++){
//            data[i-1] = data[i];
//        }
//        end--;
        return removed;
    }

    public Object front(){
        return data[0];
    }

    public void display(){
        for (Object datum : data) {
            System.out.print(datum + "<-");
        }
        System.out.println("END");
    }
    @Override
    public String toString(){
        return Arrays.toString(data);
    }

}