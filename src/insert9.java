import java.util.LinkedList;

public class insert9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		LinkedList<String> link2= new LinkedList<String>();
		link2.add("eight");
		link2.add("Nine");
		link2.add("Ten");
		System.out.println(link2);

		link.addAll(4,link2);
		System.out.println(link);


	}

}
