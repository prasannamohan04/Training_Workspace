package core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import core.address;

@Component(value = "cust")
public class customer {
	@Value("2021")
	private int custcode;
	@Value("jack")
	private String custname;
	@Autowired
	private address addr;
	public address getAddr() {
		return addr;
	}
	public void setAddr(address addr) {
		this.addr = addr;
	}
	public int getCustcode() {
		return custcode;
	}
	public void setCustcode(int custcode) {
		this.custcode = custcode;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}

}
