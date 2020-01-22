import java.util.LinkedList;

public class getFirst10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		String first=link.getFirst();
		String Last=link.getLast();
		System.out.println("First: "+first);
		System.out.println("Last: "+Last);


		


	}

}
