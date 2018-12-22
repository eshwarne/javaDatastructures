package llstack;
import llstack.Stack;
public class Main {
	public static void main(String[] args) {
		//Integer
//		Stack<Integer> s=new Stack<Integer>(2);
//		s.push(10);
//		System.out.println(s.seek());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
		
		Stack<String> s=new Stack<String>("Eshwar");
		s.push("NE");
		System.out.println(s.seek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
