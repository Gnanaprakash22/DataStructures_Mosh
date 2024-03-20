import arrays.Array;
import linkedlist.LinkedList;

import java.util.Arrays;

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

        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(50);
        list.addFirst(60);
        list.addFirst(70);
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.indexOf(100));
        System.out.println(list.contains(1));
        System.out.println(list.size());
    }
}