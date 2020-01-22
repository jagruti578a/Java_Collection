import java.util.ArrayList;

public class IncreaseSize20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> Color = new ArrayList<String>(2);
		Color.add("Black");
		Color.add("White");
		Color.add("Red");
		Color.add("Yellow");
		Color.add("Green");
		Color.add("Green");
		System.out.println(Color);
		//Color.ensureCapacity(6);
		Color.add("abc");
		Color.add("bc");
		Color.add("pdc");
		System.out.println(Color);

	}

}
