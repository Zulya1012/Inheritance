package myPackage;
//
abstract public class Person {
  private String name;
  private String lastName;
  private String address;
  private int age;
  
  public Person (String name, String lastName, String address, int age) throws Exception{
	  this.name = name;
	  this.lastName = lastName;
	  this.address = address;
	  this.age = age;
	  
	  if (!this.lastName.equals("")) {
		  this.lastName = lastName;
	  }else {
		  throw new Exception("LastName can not be empty");
	  }
  }
  
  public void setName(String name) {
	  this.name = name;
  }
  
   public void setLastName(String lastName) {
	  this.lastName = lastName;
  }
  
  public void setAddress(String address) {
	  this.address = address;
  }
  
  public void setAge(int age) {
	  this.age = age;
  }
  
  public String getName() {
	  return name;
  }
  
  public String getLastName() {
	  return lastName;
  }
  
  public String getAddress() {
	  return address;
  }
  
  public int getAge() {
	return age;
  }
}
  

  
  
 
