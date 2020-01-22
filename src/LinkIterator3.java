import java.util.LinkedList;
import java.util.*;
public class LinkIterator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		 Iterator i = link.listIterator(3);
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }


	}

}
