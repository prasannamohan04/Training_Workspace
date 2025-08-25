package sample;

public class SwitchExamples {
public static void main(String[] args) {
	int category = 8;
	switch(category) {
	case 1 -> System.out.println("40%");
	case 2 -> System.out.println("30%");
	case 3 -> System.out.println("25%");
	case 4 -> System.out.println("20%");
	default -> System.out.println("15%");}	
	
	
	String week = "tue";
	String msg = switch(week) {
	case "mon" -> {yield "working day";}
	case "sat" -> {yield "weekend";}
	default -> throw new RuntimeException("not a valid week");
	 
	};
	System.out.println(msg);
}
}
