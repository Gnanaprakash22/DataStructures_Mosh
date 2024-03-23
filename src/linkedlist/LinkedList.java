package linkedlist;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList<T> {
    private Node first;
    private Node last;

    private int size;

    private class Node{
        private Node next;
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
            last=node;
            last.next=null;
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
        }
        size--;
    }

    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first==last){
            first=last=null;
        }else {
            var previous=getPrevious(last);//O(n)
            previous.next=null;
            last=previous;
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

    public void reverse(){
        if(isEmpty()) return;

        Node p = null;
        var c=first;
        Node n;

        while (c.next!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        last=first;
        c.next=p;
        first=c;
    }

    public int getKthNodeFromEnd(int k){
        if(isEmpty())
            throw new IllegalStateException();

        var a=first;
        var b=first;

        for(int i=0;i<k-1;i++){
            b=b.next;
            if(b==null)
                throw new IllegalArgumentException();
        }

        while (b!=last){
            a=a.next;
            b=b.next;
        }

        return a.item;
    }

    public void printMiddle(){
        if(isEmpty())
            throw new IllegalStateException();

        var a=first;
        var b=first;

        //10 20 30

        while (b!=last && b.next!=last){
            b=b.next.next;
            a=a.next;
        }

        if(b==last)
            System.out.println(a.item);
        else
            System.out.println(a.item+","+a.next.item);
    }

    public boolean hasLoop(){
        LinkedList list1=new LinkedList();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);
        list1.addLast(50);
//        list1.last.next=list1.first.next.next;

        var slow=list1.first;
        var fast=list1.first;

        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow)
                return true;
        }

        return false;
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
