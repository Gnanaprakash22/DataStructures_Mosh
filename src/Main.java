import queue.ArrayQueue;

public class Main {
    public static void main(String[] args) {
//        Array numbers=new Array(3);
//        numbers.insert(10);
//        numbers.insert(20);
//        numbers.insert(30);
//        numbers.insert(40);
//        numbers.insertAt(50,0);
//        System.out.println(numbers.max());
//        int array[]={10,60,40,20};
//        System.out.println(Arrays.toString(numbers.intersect(array)));
//        numbers.print();
//        numbers.reverse();
//        numbers.print();
//        numbers.removeAt(4);
//        numbers.print();
//        numbers.removeAt(3);
//        System.out.println(numbers.max());
//        numbers.print();
//        numbers.removeAt(1);
//        numbers.print();
//        System.out.println(numbers.indexOf(20));
//        System.out.println(numbers.indexOf(30));
//        System.out.println(numbers.indexOf(100));
//        numbers.removeAt(10);

//        LinkedList<Integer> list=new LinkedList<>();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(50);
//        list.addFirst(60);
//        list.addFirst(70);
//        list.deleteFirst();
//        list.deleteLast();
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.indexOf(100));
//        System.out.println(list.contains(1));
//        System.out.println(list.size());
//        list.reverse();
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.getKthNodeFromEnd(3));
//        list.printMiddle();
//        System.out.println(list.hasLoop());
//        DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(50);
//        list.addFirst(60);
//        list.addFirst(70);
//        System.out.println(Arrays.toString(list.toArray()));
//        list.deleteFirst();
//        list.deleteLast();
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.indexOf(100));
//        System.out.println(list.contains(1));
//        System.out.println(list.size());

//        StringReverser reverser=new StringReverser();
//        System.out.println(reverser.reverse("Nasdaq"));
//        BalancedExpression exp=new BalancedExpression();
//        System.out.println(exp.isBalanced("(1+2}"));
//        Stack stack=new Stack(5);
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());

//        Stack stack=new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());

//        TwoStacks stack=new TwoStacks();
//        stack.push1(10);
//        stack.push1(20);
//        stack.push2(30);
//        stack.push2(40);
//        stack.push1(50);
//
//        System.out.println(stack.pop2());
//        System.out.println(stack.pop2());
//        System.out.println(stack);
//
//        MinStack stack=new MinStack();
//        stack.push(2);
//        stack.push(1);
//        stack.push(5);
//        stack.push(10);
//
//        System.out.println(stack.min());
//        System.out.println(stack.pop());
//        System.out.println(stack.min());
//        System.out.println(stack.pop());
//        System.out.println(stack.min());
//        System.out.println(stack.pop());
//        System.out.println(stack.min());

//        Queue<Integer>queue=new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        QueueReverser queueReverser=new QueueReverser();
//        queueReverser.reverse(queue);
//        System.out.println(queue);

        ArrayQueue queue=new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        queue.enqueue(60);
        System.out.println(queue.dequeue());
        queue.enqueue(70);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}