package Stacks;

import java.util.Arrays;

public class DynamicStack<E> extends CustomStack<E>
{
    public DynamicStack() {
    }

    public DynamicStack(int n) {
        super(n);
    }


    @Override
    public boolean push(E element) {
        if(this.isFull()){
            Object[] temp = new Object[2*data.length];

            // Copy the array
            System.arraycopy(data,0,temp,0,data.length);

            data = temp;
        }

        return super.push(element);
    }

    private void clean(){
        Object[] temp = new Object[size];
        int newSize = 0;
        for (int i = 0; i < temp.length; i++) {
            if(data[i] != null){
                temp[i] = data[i];
                newSize++;
            }

        }
        data = temp;
        size = newSize;

    }

    @Override
    public String toString(){
        this.clean();

        return Arrays.toString(data);
    }
}