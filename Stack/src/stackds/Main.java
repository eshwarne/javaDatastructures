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
	}
}
