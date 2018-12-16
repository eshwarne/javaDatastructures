package binaryTree;
import binaryTree.Node;
public class BinarySearchTree {
	public Node root;
	private int noOfNodes;
	public BinarySearchTree(int value) {
		this.noOfNodes++;
		Node n=new Node(value);
		this.root=n;
	}
	public void insert(int value) {
		Node temp=this.root;
		while(temp!=null) {
			if(value>temp.value) {
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
	public void inOrderTraverse(Node x) {
		if(x==null) {
			return;
		}
		else {
			inOrderTraverse(x.left);
			System.out.println(x.value);
			inOrderTraverse(x.right);
			return;
		}
	}
	public void preOrderTraverse(Node x) {
		if(x==null) return;
		else {
			System.out.println(x.value);
			preOrderTraverse(x.left);
			preOrderTraverse(x.right);
			return;
		}
	}
	public void postOrderTraverse(Node x) {
		if(x==null) return;
		else {
			postOrderTraverse(x.left);
			postOrderTraverse(x.right);
			System.out.println(x.value);
		}
	}
	public Node findNode(int value) {
		Node temp=this.root;
		while(temp!=null) {
			if(value>temp.value) {
				temp=temp.right;
			}
			else if(value<temp.value) {
				temp=temp.left;
			}
			else if(value==temp.value) {
				return temp;
			}
		}
		return null;
	}
	public Node findMinimum() {
		Node temp=this.root;
		while(temp.left!=null) {
			temp=temp.left;
		}
		return temp;
	}
	public Node findMaximum() {
		Node temp=this.root;
		while(temp.right!=null) {
			temp=temp.right;
		}
		return temp;
	}
}
