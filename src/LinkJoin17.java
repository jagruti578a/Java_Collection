import java.util.LinkedList;

public class LinkJoin17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		LinkedList<String> link2 = new LinkedList<String>();
		link2.add("One");
		link2.add("Two");
		link2.add("Three");
		link2.add("Four");
		link2.add("Five");
		System.out.println(link);
		LinkedList<String> link3 = new LinkedList<String>();
		link3.addAll(link);
		link3.addAll(link2);
		
		System.out.println(link3);

	}

}
