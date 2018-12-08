package binaryTree;

public class Node {
	int value;
	Node left=null;
	Node right=null;
public Node(int a) {
	this.value=a;
}
public void setLeftChild(Node n) {
	this.left=n;
}
public void setRightChild(Node n) {
	this.right=n;
}
public Node getLeftChild() {
	return this.left;
}
public Node getRightChild() {
	return this.right;
}
}


