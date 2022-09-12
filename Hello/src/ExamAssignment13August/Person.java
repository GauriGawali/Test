package ExamAssignment13August;
/*
 2.	Create class Person which has attributes (name, gender, age, Address). Address is class which has attributes (city, state, country). 
 Display Persons data
Note. Containment using constructor and getter/setter

 */
public class Person {
	String name,gender;
	int age;
	Address a;
	
	/*Person(String name,String gender,int age,Address a){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.a=a;
	}
	
	public String toString() {
		return "\nPerson name is:="+name+"\nPerson gender is:= "+gender+"\nPerson age is:= "+age+"\nPerson Address details is:= "+a;
	}*/
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setA(Address a) {
		this.a=a;
	}
	public Address getA() {
		return a;
	}

}
