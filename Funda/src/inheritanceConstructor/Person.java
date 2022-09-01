package inheritanceConstructor;

public class Person {  String name,contact,address;
void setperson(String name,String Address,String contact) {
	this.name=name;
	this.address=address;
	this.contact=contact;
	
}

void display() {
	System.out.println("Person name is:"+name);
	System.out.println("Address is:"+address);
	System.out.println("Contact no is:"+contact);
}

}
