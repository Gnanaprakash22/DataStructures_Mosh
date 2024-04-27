package stack.array;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private int[] array;
    private int count;
    public Stack(int capacity) {
        array=new int[capacity];
    }

    public void push(int item){
        if(isFull())
           throw new StackOverflowError();

        array[count++]=item;
    }

    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();

        return array[--count];
    }

    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();

        return array[count-1];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public boolean isFull(){
        return count==array.length;
    }

    @Override
    public String toString() {
        int content[]=Arrays.copyOfRange(array,0,count);
        return Arrays.toString(content);
    }
}
