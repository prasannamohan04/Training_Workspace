package sample;
import java.util.Collections;
import java.util.ArrayList;


public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101,"sutherland",5000));
		emplist.add(new Employee(201,"james gosling",8000));
		emplist.add(new Employee(302,"reactjs",7000));
		Collections.sort(emplist);
		for(Employee emp :emplist)
			System.out.println(emp.getSalary());
		System.out.println();
		Collections.sort(emplist,(emp1,emp2)->{
			return (int) (emp2.getSalary() - emp1.getSalary());
		});
		for(Employee emp : emplist)
			System.out.println(emp.getSalary());


	}

}
