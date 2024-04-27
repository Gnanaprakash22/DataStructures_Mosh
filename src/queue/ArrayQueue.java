package queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private int front=0;
    private int rear=0;
    private int array[];
    private int count;

    public ArrayQueue(int capacity) {
        array=new int[capacity];
    }

    public void enqueue(int item){
        if(isFull())
            throw new IllegalStateException();

        array[rear]=item;
        rear = (rear+1) % array.length;
        count++;
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();

        var item=array[front];
        array[front]=0;
        front=(front+1) % array.length;
        count--;

        return item;
    }

    public int peek(){
        if(isEmpty())
            throw new NoSuchElementException();

        return array[front];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public boolean isFull(){
        return count==array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
