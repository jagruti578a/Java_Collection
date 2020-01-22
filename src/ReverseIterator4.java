import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
	    Iterator it = link.descendingIterator();

		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }


	}

}
