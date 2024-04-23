package queue.exercises;

public class LinkedListQueue {

    private Node first;
    private Node last;
    private int size;

    private class Node{
        private Node next;
        private int value;

        public Node(int value) {
            this.value=value;
        }

        @Override
        public String toString() {
            return ""+value;
        }
    }

    public void enqueue(int value){
        var node=new Node(value);

        if(isEmpty()){
            first=last=node;
        }else {
            last.next=node;
            last=node;
        }
        size++;
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();

        var item=first.value;

        if(first==last){
            first=last=null;
        }else {
            var second=first.next;
            first.next=null;
            first=second;
        }
        size--;

        return item;
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();

        var item=first.value;

        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int array[]=new int[size];
        int index=0;
        var current=first;

        while (current!=null){
            array[index++]=current.value;
            current=current.next;
        }

        return array;
    }


}
