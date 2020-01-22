import java.util.ArrayList;
import java.util.List;

public class Join15 {

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
		List <String> Color2 = new ArrayList<String>();
		Color2.add("Black");
		Color2.add("White");
		Color2.add("Red");
		Color2.add("Yellow");
		Color2.add("Green");
		Color2.add("Green");
		System.out.println(Color2);
		List <String> Color3 = new ArrayList<String>();
		Color3.addAll(Color);
		Color3.addAll(Color2);
		System.out.println("After Jopining two arraylist:\n"+Color3);
		

	}

}
