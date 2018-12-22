package queueUsingLinkedList;

public class Queue<T> {
	//Inner Class
	public static class QueueNode<T>{
		private T value;
		private QueueNode<T> next;
		public QueueNode(T value) {
			this.value=value;
		}
	}
	//Properties
	private QueueNode<T> head;
	private QueueNode<T> tail;
	int len=0;
	public Queue(T value) {
		QueueNode<T> node=new QueueNode<T>(value);
		this.head=node;
		this.tail=node;
		this.len++;
	}
	public void enqueue(T value) {
		QueueNode<T> node=new QueueNode<T>(value);
		if(this.head!=null) {
			this.tail.next=node;
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
			this.tail=node;
		}
		len++;
	}
	public T dequeue() {
		if(len==0) return null;
		len--;
		QueueNode<T> node=this.head;
		this.head=node.next;
		T val=node.value;
		return val;
	}
}
