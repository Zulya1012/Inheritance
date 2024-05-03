package myPackage;

public class Employee extends Person {
	private int bankId;
	
	
	public Employee(String name, String lastName, String address, int age) throws Exception{
		super(name, lastName, address, age);
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	
	public int getBankId() {
		return bankId;
	}
 
}
