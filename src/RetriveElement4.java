import java.util.ArrayList;
import java.util.List;

public class RetriveElement4 {

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
		String first= Color.get(0);
		System.out.println("First = "+first);
		String Second= Color.get(1);
		System.out.println("Second= "+Second);

		
		
	}

}
