package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoStacks {

    private int array[];
    private int count1;
    private int count2;

    public TwoStacks() {
        array=new int[5];
        count1=0;
        count2=array.length-1;
    }

    public void push1(int item){
        if(isFull1())
            throw new StackOverflowError();
        array[count1++]=item;
    }

    public void push2(int item){
        if(isFull2())
            throw new StackOverflowError();
        array[count2--]=item;
    }

    public int pop1(){
        if(isEmpty1())
            throw new EmptyStackException();

        return array[--count1];
    }

    public int pop2(){
        if(isEmpty2())
            throw new EmptyStackException();

        return array[++count2];

    }

    public boolean isFull1(){
        return count1>count2;
    }

    public boolean isFull2(){
        return count2<count1;
    }

    public boolean isEmpty1(){
        return count1==0;
    }

    public boolean isEmpty2(){
        return count2==array.length-1;
    }

    @Override
    public String toString() {
//        var content= Arrays.copyOfRange(array,count1,count2);
        return Arrays.toString(array);
    }
}
