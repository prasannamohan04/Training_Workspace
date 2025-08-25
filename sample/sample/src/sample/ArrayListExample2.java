package sample;
import java.util.ArrayList ;
public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hyd");
		list.add("java");
		list.add("spring");
		for (String str : list) {
			System.out.println(str);
		}

	}

}
