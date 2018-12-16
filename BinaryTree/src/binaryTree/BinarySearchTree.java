package binaryTree;
import binaryTree.Node;
public class BinarySearchTree {
	private Node root;
	private int noOfNodes;
	public BinarySearchTree(int value) {
		this.noOfNodes++;
		Node n=new Node(value);
		this.root=n;
	}
	public void insert(int value) {
		Node temp=this.root;
		while(temp!=null) {
			if(value>this.root.value) {
				if(temp.right==null) {
					temp.right=new Node(value);
					this.noOfNodes++;
					break;
				}
				temp=temp.right;
			}
			else {
				if(temp.left==null) {
					temp.left=new Node(value);
					this.noOfNodes++;
					break;
				}
				temp=temp.left;
			}
		}
	}
}
