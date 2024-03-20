package linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
    private Node first;
    private Node last;

    private int size;

    private class Node{
        private Node next;
        private Node previous;
        private int item;

        Node(int item) {
            this.item = item;
        }

        @Override
        public String toString() {
           return ""+item;
        }
    }

    public void addLast(int item){
        var node=new Node(item);

        if(isEmpty()){
            first=last=node;
        }else {
            last.next=node;
            node.previous=last;
            last=node;
        }
        size++;
    }

    public void addFirst(int item){
        var node=new Node(item);

        if(isEmpty()) {
            first = last = node;
        }else {
            var second=first;
            first=node;
            first.next=second;
            second.previous=first;
        }
        size++;
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first==last){
            first=last=null;
        }else {
            var second=first.next;
            first.next=null;
            first=second;
            first.previous=null;
        }
        size--;
    }

    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first==last){
            first=last=null;
        }else {
            var previousToLastNode=last.previous;//O(1)
            previousToLastNode.next=null;
            last=previousToLastNode;
        }
        size--;
    }

    public int indexOf(int item){
        int index=0;
        var current=first;
        while (current!=null){
            if(current.item==item)
                return index;
            current=current.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int item){
        return indexOf(item)!=-1;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int array[]=new int[size];
        int index=0;
        var current=first;
        while (current!=null){
            array[index++]=current.item;
            current=current.next;
        }

        return array;
    }

    private boolean isEmpty(){
        return first==null;
    }

    private Node getPrevious(Node node){
        var current=first;

        while (current!=null){
            if(current.next==node){
                return current;
            }
            current=current.next;
        }

        throw new RuntimeException("Node not found");
    }
}
