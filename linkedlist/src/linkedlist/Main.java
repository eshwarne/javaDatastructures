package linkedlist;
import linkedlist.LinkedList;
public class Main {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList(1);
		l1.insert(0, 5);
		l1.insert(0, 7);

		l1.insert(l1.getLength()-1,8);
		l1.insert(l1.getLength()-1,100);
		l1.insert(2, 2);
		l1.replace(2,10);
//		l1.delete(4);
		l1.print();
	}
}
