package queue;

import java.util.Queue;
import java.util.Stack;

public class QueueReverser {

    public void reverse(Queue<Integer>queue){
        Stack<Integer>stack=new Stack<>();

        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }

        while (!stack.empty()){
            queue.offer(stack.pop());
        }
    }
}
