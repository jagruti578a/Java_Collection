import java.util.ArrayList;
import java.util.List;

public class RemoveArraylist6 {

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
		Color.remove(2);
		System.out.println(Color);
		

	}

}
