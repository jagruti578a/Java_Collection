import java.util.LinkedList;

public class ListInsert5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		link.add(2,"six");
		System.out.println(link);

	}

}
