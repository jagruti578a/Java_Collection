import java.util.ArrayList;
import java.util.List;
public class IterateArraylist2 {
	public static void main(String args[])
	{
		List <String> Color = new ArrayList<String>();
			Color.add("Black");
			Color.add("White");
			Color.add("Red");
			Color.add("Yellow");
			Color.add("Green");
			Color.add("Green");
			for(String iterate: Color) {
			System.out.println(iterate);
			}
	}

}
