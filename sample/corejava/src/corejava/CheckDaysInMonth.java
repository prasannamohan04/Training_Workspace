package corejava;

import java.util.Scanner;

public class CheckDaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first 3 letters of a month : ");
		String Mthip = sc.next();
		Months input;
		try {
			input = Months.valueOf(Mthip);
		    int numberOfDaysOfInputMonth = switch(input){
			case Jan,Mar,May,Jul,Aug,Oct,Dec -> 31;
			case Feb ->28;
			case Apr,Jun,Sep,Nov -> 30;
			default ->throw new InvalidMonthException("Not a valid month" + Mthip);
			};
			System.out.println("Number of days in the given "+input +" is "+numberOfDaysOfInputMonth);
		}catch (IllegalArgumentException | InvalidMonthException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Program executed Successfully");
		}

	}

}
