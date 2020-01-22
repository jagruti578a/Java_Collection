import java.util.ArrayList;

public class CheckEmptyorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> Color = new ArrayList<String>();
		Color.add("Black");
		Color.add("White");
		Color.add("Red");
		Color.add("Yellow");
		Color.add("Green");
		Color.add("Green");
		System.out.println(Color);
		Color.removeAll(Color);
		System.out.println("Array is Empty: ?"+Color.isEmpty());

	}

}
