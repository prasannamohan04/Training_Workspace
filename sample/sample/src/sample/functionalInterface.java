package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class functionalInterface {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(101,"sutherland",5000));
		emplist.add(new Employee(201,"james gosling",8000));
		emplist.add(new Employee(211,"oda",7500));
		emplist.add(new Employee(301,"james",8500));
		
		try {
            Employee emp =  emplist.stream()
	                .filter(em -> em.getCode() == 201)
	                .map(e->e).findFirst()
	                .orElseThrow(()->new EmployeeNotFoundException());
            System.out.println("Employee found: " + emp);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
		//List<Employee>salarywise = (List<Employee>) emplist.stream()
		//		.filter((emp)->emp.getSalary()>7000 )
		//		.map((e)->e)
		//		.collect(Collectors.toList());
		//System.out.print(salarywise);
		//Optional<Employee> eop = emplist.stream()
	    //            .filter(emp -> emp.getCode() == 201)
	    //            .findFirst();
		// if (eop.isPresent()) {
	     //       System.out.println("Employee found: " + eop.get());
	    //    } else {
	      //      System.out.println("Employee with ID 201 not found.");
	        
	
	
		 
		
		
		

	}


