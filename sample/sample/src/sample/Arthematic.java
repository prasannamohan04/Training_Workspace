package sample;

public interface Arthematic {
	int add(int x, int y);
	default void display() {
		System.out.println("this is a default method");
	}
	static void message() {
		System.out.println("this is a static method");
	}
}
