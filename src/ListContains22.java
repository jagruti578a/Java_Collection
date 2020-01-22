import java.util.LinkedList;

public class ListContains22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		if(link.contains("Two"))
		{
			System.out.println("contains");
			
		}
		else
			System.out.println("notcontains");
	

	}

}
