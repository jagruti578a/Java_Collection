import java.util.ArrayList;


public class Clone16 {

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
      

		ArrayList <String> Color4 = (ArrayList<String>)Color.clone();
		
		System.out.println(Color4);

	}

}
