import java.util.ArrayList;
import java.util.List;

public class Compare13 {

	public static void main(String[] args) {
		int ans= 0;
		// TODO Auto-generated method stub
		List <String> Color = new ArrayList<String>();
		Color.add("Black");
		Color.add("White");
		Color.add("Red");
		Color.add("Yellow");
		Color.add("Green");
		Color.add("Green");
		System.out.println(Color);
		List <String> Color2 = new ArrayList<String>();
		Color2.add("Black");
		Color2.add("White");
		Color2.add("Red");
		Color2.add("Yellow");
		Color2.add("Green");
		Color2.add("Green");
		System.out.println(Color2);
		for (String e: Color)
		{
			if(Color2.contains("White"))
			{
				ans= 1;

			}
			else
				ans= 0;
	}
	
	if(ans == 1)
	{
		System.out.println("Same");
	}
	else
		System.out.println("NotSame");
		
	}

}
