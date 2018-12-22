package llstack;

public class Stack<T> {
	//Inner Class for Node
	private static class Node<T>{
		private T data;
		private Node<T> next;
		public Node(T value) {
			this.data=value;
			this.next=null;
		}
	}
	//Properties
	public Node<T> top=null;
	int len=0;
	public Stack(T data) {
		Node<T> node = new Node<T>(data);
		this.top=node;
		this.len++;
	}
	
	//Stack push operation
	public void push(T data) {
		this.len++;
		Node<T> node=new Node<T>(data);
		node.next=top;
		this.top=node;
	}
	
	//Stack pop operation
	public T pop() {
		if(this.len==0) return null;
		Node<T> node=top;
		this.top=top.next;
		T value=node.data;
		node = null;
		this.len--;
		return value;
	}
	
	public T seek() {
		return this.top.data;
	}
}
