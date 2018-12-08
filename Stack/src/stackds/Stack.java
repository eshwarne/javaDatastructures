package stackds;

public class Stack {
	private int[] stack;
	private int top=-1;
	private int length=0;
	public Stack(int a,int limit) {
		this.stack=new int[limit];
		this.length++;
		this.top++;
	}
	//function to perform push operation of stack
	public void push(int a) {
		if(length==stack.length) {
			System.out.println("ERROR, STACK OVERFLOW, CONSIDER A POP OPERATION");
		}
		else {
			this.length++;
			this.top++;
			stack[top]=a;
		}
	}
	//function to return the top element
	public int seek() {
		return this.top==-1?-1: top;
	}
	//Function to display the stack elements
	public void print() {
		int i=0;
		while(i<this.length) {
			System.out.print(this.stack[i]+" ");
			i++;
		}
	}
}
