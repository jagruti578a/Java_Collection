import java.util.LinkedList;

public class LinkRemoveall14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		link.removeAll(link);
		System.out.println(link);

	}

}
