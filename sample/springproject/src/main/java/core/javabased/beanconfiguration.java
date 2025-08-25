package core.javabased;

import org.springframework.context.annotation.Bean;

public class beanconfiguration {
	@Bean
	public account getAccount() {
		account acn = new account();
		acn.setAccno(12345678);
		acn.setBal(987652);
		acn.setCustname("gold man");
		
		return acn;
	}

}
