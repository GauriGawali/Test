package inheritanceConstructor;

public class Employee extends Person {
int id;
String company ,department;
 void setEmployee(int id,String company,String department) {
	 this.id=id;
	 this.company=company;
	 this.department=department;
 }
 void display() {
	 super.display();
	 System.out.println("Employee id no:"+id);
	 System.out.println("Company name is:"+company);
	 System.out.println(" working Department:"+department);
 }
}
