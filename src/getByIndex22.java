import java.util.ArrayList;
import java.util.List;

public class getByIndex22 {

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
		int size1= Color.size();
		for(int i=0; i< size1; i++)
			
		System.out.println("element at index"+i+":"+ Color.get(i));
	}

}
