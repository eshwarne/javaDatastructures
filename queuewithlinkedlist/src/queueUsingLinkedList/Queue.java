package queueUsingLinkedList;

public class Queue<T> {
	public static class QueueNode<T>{
		private T value;
		private QueueNode<T> head;
		private QueueNode<T> tail;
	}
}
