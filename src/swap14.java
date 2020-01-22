import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swap14 {

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
		Collections.swap(Color, 0, 2);
		System.out.println(Color);

	}

}
