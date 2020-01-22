import java.util.LinkedList;
import java.util.*;

public class listconvertArraylist23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		List<String> array1= new ArrayList<String>(link);
		for(String arr: array1)
		System.out.println(arr);


	}

}
