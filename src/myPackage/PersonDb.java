package myPackage;

public class PersonDb {
	public void Save(Person p) {
		if (p instanceof Employee) {
			Employee e = (Employee)p;
			System.out.println("Insert into employees values("+ e.getName() + e.getLastName()+ e.getAddress()+ e.getAge()+ e.getBankId());
		}
		if (p instanceof Customer) {
			Customer c = (Customer)p;
			System.out.println("Insert into employees values("+ c.getName() + c.getLastName()+ c.getAddress()+ c.getAge());
		}
	}

}
