package stack.linkedlist;

import java.util.EmptyStackException;

public class Stack {

    Node first;
    Node last;

    private class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", value=" + value +
                    '}';
        }
    }

    public void push(int value){
        var node=new Node(value);

        if(isEmpty()){
            first=last=node;
        }else {
            last.next=node;
            last=node;
        }
    }

    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();

        Node node;
        if(first==last){
            node=first;
            first=last=null;
        }else {
            node=last;
            var previous=getPrevious(last);
            last=previous;
            last.next=null;
        }

        return node.value;
    }

    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();

        return last.value;
    }

    public boolean isEmpty(){
        return first==null;
    }

    private Node getPrevious(Node node){
        var current=first;
        while (current!=node){
            if(current.next==node)
                return current;
            current=current.next;
        }

        return null;
    }

}
