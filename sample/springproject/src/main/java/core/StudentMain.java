package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("springconfig.xml");
		Student std = (Student) ctx.getBean("empl");
		System.out.println(std.getRegno()+ " "+ std.getStdname());
		

	}

}
