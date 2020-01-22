import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy9 {

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
		List <String> Number  = new ArrayList <String>();
		Number.add("1");
		Number.add("2");
		Number.add("3");
		Number.add("4");
		Number.add("5");
		Number.add("6");
		System.out.println(Number);
		 Collections.copy(Number,Color);
		 System.out.println("After Copy: \n");
		 System.out.println(Color);
		 System.out.println(Number);
		 

	}

}
