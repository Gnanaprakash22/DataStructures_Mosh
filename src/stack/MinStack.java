package stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer>stack;
    private Stack<Integer>minStack;

    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int item){
        stack.push(item);

        if(minStack.empty()){
            minStack.push(item);
        }else if(item < minStack.peek()){
            minStack.push(item);
        }
    }

    public int pop(){
        var top=stack.pop();

        if(top==minStack.peek())
            minStack.pop();

        return top;
    }

    public int min(){
        return minStack.peek();
    }
}
