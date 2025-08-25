package core.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class accountmain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(beanconfiguration.class);
		account acon = ctx.getBean("getAccount",account.class);
		
		System.out.println(" account num = "+acon.getAccno()+"\n"+"cust name : "+ acon.getCustname()+"\n"+" cust balance : "+ acon.getBal());
		
		

	}

}
