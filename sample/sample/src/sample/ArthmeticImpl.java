package sample;

public class ArthmeticImpl {
	public static void main(String[] args) {
		Arthematic arth = (x,y) -> {
			System.out.println("result");
			return x+y;	
		};
		int a = arth.add(5, 6);
		System.out.println(a);
		arth.display();
		Arthematic.message();
	}
}
