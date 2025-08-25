package com.sutherland.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sutherland.beans.Employee;
@Service
public class employeeServise {
	static List<Employee> emplist;
	static {
		emplist = Arrays.asList((new Employee(247,"mohan",8000)),(new Employee(433,"ram",9000)));
		
	}
	public List<Employee> getEmployeeList(){
		return emplist;
	}

}
