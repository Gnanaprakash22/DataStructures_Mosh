package arrays;

import java.util.Arrays;

public class Array {
    private int count;
    private int []numbers;
    public Array(int capacity) {
        numbers=new int[capacity];
    }

    public void insert(int number){
        if(isResizeRequired()){
            int []newNumbers=new int[numbers.length*2];
            for(int i=0;i<numbers.length;i++){
                newNumbers[i]=numbers[i];
            }
            numbers=newNumbers;
        }
        numbers[count++]=number;
    }

    public void removeAt(int index){
        if(isIndexOutOfRange(index))
            throw new RuntimeException("Index is out of range");

        for(int i=index;i<count;i++){
//            if(i+1<count)
                numbers[i]=numbers[i+1];
        }
        count--;
    }

    private boolean isIndexOutOfRange(int index) {
        return index < 0 || index >= count;
    }

    public int indexOf(int number){
        for(int i=0;i<count;i++){
            if(numbers[i]==number)
                return i;
        }

        return -1;
    }

    public int max(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<count;i++){
            max=Math.max(max,numbers[i]);//O(n)
        }

        return max;
    }

    public void print(){
        int temp[]=Arrays.copyOfRange(numbers,0,count);
        System.out.println(Arrays.toString(temp));
    }

    public int[] intersect(int array[]){
        int intersection[]=new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++){
            if(contains(array[i])){
                intersection[index++]=array[i];
            }
        }

        return intersection;
    }

    public boolean contains(int number){
        return indexOf(number)!=-1;
    }

    public void reverse(){
        int index=0;
        int temp[]=new int[numbers.length];
        for(int i=count-1;i>=0;i--){
             temp[index++]=numbers[i];
        }
        numbers=temp;
    }

    public void insertAt(int item,int index){
        if(isIndexOutOfRange(index))
            throw new RuntimeException("Index is out of range");

        int []newNumbers=new int[numbers.length*2];
        for(int i=0;i<numbers.length;i++){
            newNumbers[i]=numbers[i];
        }
        numbers=newNumbers;

        for(int i=count-1;i>=index;i--){
            numbers[i+1]=numbers[i];
        }
        numbers[index]=item;
        count++;
    }

    private boolean isResizeRequired() {
        return count == numbers.length;
    }
}
