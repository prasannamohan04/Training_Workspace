package core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class customermain {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("annotaion.xml");
		customer cust = ctx.getBean("cust", customer.class);
		
		System.out.println("cust code = "+cust.getCustcode()+"\n"+"cust name : "+ cust.getCustname()+"\n"+"cust address = "+ cust.getAddr().getCity());
	}

}
