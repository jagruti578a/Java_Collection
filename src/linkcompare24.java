import java.util.LinkedList;

public class linkcompare24 {

	public static void main(String[] args) {
		int ans=0;
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("One");
		link.add("Two");
		link.add("Three");
		link.add("Four");
		link.add("Five");
		System.out.println(link);
		LinkedList<String> link1 = new LinkedList<String>();
		link1.add("One");
		link1.add("Two");
		link1.add("Three");
		link1.add("Four");
		link1.add("Five");
		System.out.println(link1);
		for(String compare: link)
		{
			if(link.contains(compare))
			{
				ans=1;
			}
		else
		{
			ans=0;
	}
		}


		if(ans== 1)
		{
			System.out.println("same\n");
		}
		else
		{
			System.out.println("notsame");
		}
	}
}
	