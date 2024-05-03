package myPackage;

public class Project {

	public static void main(String[] args) throws Exception {
		
		
		Employee e = new Employee("Anar", " ", "Sumqayit", 30);
		//e.setName("Anar");
		//e.setLastName("Ahmedov");
		//e.setAddress("Sumqayit");
		//e.setAge(30);
		e.setBankId(12345);
		
		Customer c1 = new Customer("Aynur","Ivanova","Gance", 29);
		//c1.setName("Aynur");
		//c1.setLastName("Ivanova");
		//c1.setAddress("Gance");
		//c1.setAge(29);
		
		PersonDb pd = new PersonDb();
		pd.Save(e);
		pd.Save(c1);
	}

}
