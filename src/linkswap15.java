import java.util.Collections;
import java.util.LinkedList;

public class linkswap15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		Collections.swap(link, 2, 3);
		System.out.println(link);


	}

}
