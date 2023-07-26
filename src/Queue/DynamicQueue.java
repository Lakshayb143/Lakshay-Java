package Queue;

public class DynamicQueue<E> extends CircularQueue<E>
{
    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    protected void increaseCapacity(){
        Object[] temp = new Object[2 * data.length];

        // Copying the array
      for(int i = 0; i < data.length ; i++){
          temp[i] = data[(front + i )% data.length];
      }

        front = 0;
        end = data.length;
        data = temp;

}
    @Override
    public void add(E element){
        if(isFull()){
            increaseCapacity();
            System.out.println(front + " " + end);
        }


        super.add(element);
    }
}