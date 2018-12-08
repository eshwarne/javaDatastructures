/*
 *AUTHOR : Eshwar.S
 *Stack is an abstract linear data structure, that supports push, pop and seek operations
 *Stack is very useful for storing data which are accessed in a FILO and LIFO manner
 *All the operations are O(1) time complexity except for the print method*/
package stackds;
import stackds.Stack;
public class Main {
	public static void main(String[] args) {
		Stack s1=new Stack(0,10);
		s1.push(10);
		s1.push(100);
		s1.print();
		System.out.println();
		System.out.println(s1.seek());
		System.out.println(s1.pop());
		s1.pop();
		s1.pop();
		
		//returns error, stack is empty
		System.out.println(s1.pop());
		
	}
}
