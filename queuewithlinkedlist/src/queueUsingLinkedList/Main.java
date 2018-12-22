package queueUsingLinkedList;
import queueUsingLinkedList.Queue;
public class Main {
	public static void main(String[] args) {
		Queue<Integer> queue=new Queue<Integer>(10);
		System.out.println(queue.dequeue());
		queue.enqueue(11);
		queue.enqueue(12);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
}}
