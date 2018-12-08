package linkedlist;
import linkedlist.Node;
public class LinkedList {
	private Node head;
	private int length=0;
	public LinkedList(int a) {
		Node b=new Node(a);
		if(length==0) {
			this.head=b;
		}
		this.length++;
	}
	public void insert(int index,int value) {
		Node current=this.head;
		Node New=new Node(value);
		if(index==0) {
			this.head=New;
			New.setNextNode(current);
			this.length++;
			return;
		}
		if(index==length-1) {
			for(int i=0;i<this.length-1;i++) {
				current=current.getNextNode();
			}
			current.setNextNode(New);
			this.length++;
			return;
		}
		else {
			for(int i=0;i<index-1;i++) {
				current=current.getNextNode();
			}
			Node prevNext=current.getNextNode();
			current.setNextNode(New);
			New.setNextNode(prevNext);
		}
	}
	public int getLength() {
		return this.length;
	}
	public void replace(int index,int value) {
		Node current=this.head;
		for(int i=0;i<index;i++) {
			current=current.getNextNode();
		}
		current.setValue(value);
	}
	public void delete(int index) {
		Node current=this.head;
		if(index==0) {
			this.head=current.getNextNode();
			current=null;
			this.length--;
		}
		else {
			for(int i=0;i<index-1;i++) {
				current=current.getNextNode();
			}
		current.setNextNode(current.getNextNode().getNextNode());
		current=current.getNextNode();
		current=null;
		this.length--;		}
	}
	public void print() {
		Node current=this.head;
		for(int i=0;i<length;i++) {
			System.out.println(current.getValue());
			current=current.getNextNode();
		}
	}
}
