import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Collection {
    public static void main(String[] args) {
        
        //.Arraylist.linkeslist.vector.hashset.Treeset.PriorityQueue.hashMap.TreeMap.interface.iterator.ListIterator etc


        //list

        //ArrayList

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2, 20);
        System.out.println("ArrayList = " + list);

        //LinkedList

        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(70);
        linkedlist.add(80);
        linkedlist.add(60);
        linkedlist.add(10);
        linkedlist.remove(3);
        System.out.println("Linkedlist = " + linkedlist);

        //Vector

        Vector<String> vector = new Vector<String>();
        vector.add("5");
        vector.add("10");
        vector.add("6");
        vector.add("55");
        System.out.println("Vector = " +vector);

        //stack

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(30);
        stack.push(50);
        stack.push(60);
        System.out.println("Stack = " + stack);
        stack.pop();
        System.out.println(stack.peek());



        //Queue  FIFO

        Queue<Integer> queue = new LinkedList<>();
        queue.add(30);
        queue.offer(90);
        queue.offer(60);
        queue.add(20);
        System.out.println("Queue = " +queue);
        System.out.println("Q remove = "+queue.remove());
        System.out.println("Queue = " +queue);
        System.out.println("Q poll = "+queue.poll());
        System.out.println("Queue = " +queue);

        //PriorityQueue Double ended Queue

        //ArrayDeque

        Deque<Integer> dequeue = new ArrayDeque<>();
        dequeue.offer(10);
        dequeue.offer(20);
        dequeue.offerLast(30);
        dequeue.offerFirst(40);

        System.out.println( "Deque= " + dequeue);
        
        
    }
}
