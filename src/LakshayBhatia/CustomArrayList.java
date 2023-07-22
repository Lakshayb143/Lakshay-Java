package LakshayBhatia;
import java.util.AbstractCollection;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class CustomArrayList<E>
{
    private Object[] data;

    private int size;
    final private int DEFAULT_SIZE = 10;


    public CustomArrayList(){
        data = new Object[DEFAULT_SIZE];
        size = 0;

    }

    public CustomArrayList(int initialCapacity){
        data = new Object[initialCapacity];
        size = 0;
    }

    public void add(E element){
        if(isFull()){
            increaseCapacity();
        }
        data[size] = element;
        size++;
    }

    private void increaseCapacity() {
        Object[] temp = new Object[data.length * 2];

        // copying all the elements from data
        for(int i = 0 ; i < data.length ; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int size(){
        return size;
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public E get(int index){
        if (checkIndex(index)){
            return (E) data[index];

        }
        return null;

    }

    private boolean checkIndex(int index) {
        return index <= size;
    }

    public void clear(){
        Object[] temp = new Object[DEFAULT_SIZE];
        data = temp;
    }

    public void sort(){
        Arrays.sort(data);
    }


    public int indexOf(E element){
        for(int i = 0; i <=size ; i++){
            if(data[i] == element){
                return i;
            }
        }
        return -1;
    }

    public void setData(int index , E element){
        data[index] = element;
    }

    public boolean contains(E element){
        if(binarySearch(data,element) >= 0){
            return true;
        }
        return false;
    }


    public void remove(int index){
        if (isEmpty()){
            return;
        }
        for(int i = index ; i < size - 1; i++){
            data[i] = data[i+1];
        }
        data[size-1] = null;
        size--;
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

    public E pop(){
        E removed = (E) data[--size];
        return removed;
    }

}
