package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class empsalarymain {
	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("springconfig.xml");
		salary std = (salary) ctx.getBean("sal");
		System.out.println("emp code = "+std.getCodeo()+"\n"+"emp name : "+ std.getEmpnameo()+"\n"+"emp salary = "+std.getSalaryo()+"\n"+"emp address = "+ std.getAddr().getCity()+" , " +std.getAddr().getPincode());
		

	}

}
