import java.util.LinkedList;

public class listwithindex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		int Size1=link.size();
		for(int i=0;i<Size1;i++)
		{
		      System.out.println("Element at index "+i+": "+link.get(i));
		}
		

	}

}
