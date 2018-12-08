package linkedlist;

public class Node {
	private int value;
	private Node next;
	public Node() {
		this.value=0;
		this.next=null;
	}
	public Node(int a) {
		this.value=a;
		this.next=null;
	}
	public void setValue(int a) {
		this.value=a;
	}
	public void setNextNode(Node n) {
		this.next=n;
	}
	public int getValue() {
		return this.value;
	}
	public Node getNextNode() {
		return this.next;
	}
	
}
