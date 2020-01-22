import java.util.ArrayList;
import java.util.List;

public class Extract12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> Color = new ArrayList<String>();
		Color.add("Black");
		Color.add("White");
		Color.add("Red");
		Color.add("Yellow");
		Color.add("Green");
		Color.add("Green");
		System.out.println(Color);
		 List<String> color3 = Color.subList(0, 3);
		 System.out.println("Sub string: "+color3);
		

	}

}
