package binaryTree;
import binaryTree.BinarySearchTree;
public class Main {
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree(10);
		bst.insert(5);
		bst.insert(11);
		bst.insert(10);
		bst.inOrderTraverse(bst.root);
		System.out.println();
		bst.postOrderTraverse(bst.root);
		System.out.println();
		bst.preOrderTraverse(bst.root);
		System.out.println("SEARCHING:");
		System.out.println(bst.findNode(11).value);
		System.out.println("MINIMUM VALUE:");
		System.out.println(bst.findMinimum().value);
		System.out.println("MAXIMUM VALUE");
		System.out.println(bst.findMaximum().value);
		bst.delete(99);
		bst.delete(11);
		System.out.println(bst.findMaximum().value);
	}
}
