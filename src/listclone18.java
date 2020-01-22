import java.util.LinkedList;

public class listclone18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		LinkedList<String> link1 = new LinkedList<String>();
		link1= (LinkedList)link.clone();
		
		System.out.println(link1);


	}

}
