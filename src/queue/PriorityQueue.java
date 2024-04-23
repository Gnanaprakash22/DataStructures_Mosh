package queue;

import java.util.Arrays;

public class PriorityQueue {

    private int array[];
    private int count;

    public PriorityQueue(int capacity) {
        array=new int[capacity];
    }

    public void add(int item){
        if(isFull())
            throw new IllegalStateException();

        var i = shiftItemToInsert(item);
        array[i]=item;
        count++;
    }

    private int shiftItemToInsert(int item) {
        int i;
        for(i=count-1;i>=0;i--){
            if(array[i]> item){
                array[i+1]=array[i];
            }else
                break;
        }
        return i+1;
    }

    public int remove(){
        if(isEmpty())
            throw new IllegalStateException();

        return array[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
