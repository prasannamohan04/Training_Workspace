package sample;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("hibernate");
		set.add("sutherland");
		set.add("abcd");
		set.add("java");
		set.add("500");
		System.out.println(set);
		TreeSet<Employee> empset = new TreeSet<Employee>();
		empset.add(new Employee(101,"sutherland",5000));
		empset.add(new Employee(201,"james gosling",8000));
		empset.add(new Employee(302,"reactjs",7000));
		for(Employee emp :empset)
			System.out.println(emp.getCode()+ emp.getEmpname());

	}

}
