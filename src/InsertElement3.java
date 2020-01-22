import java.util.ArrayList;
import java.util.List;

public class InsertElement3 {
	public static void main(String args[])
	{
		{
			List <String> Color = new ArrayList<String>();
				Color.add("Black");
				Color.add("White");
				Color.add("Red");
				Color.add("Yellow");
				Color.add("Green");
				Color.add("Green");
				System.out.println(Color);
				Color.add(0,"pink");
				System.out.println(Color);
		}
	}

}
