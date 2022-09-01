package inheritanceConstructor;

public class Manager  extends Employee{
	int salary;
	String designation;
	
	void setManager(int salary,String designation) {

		this.salary=salary;
        this.designation=designation;
}
void display() { 

	
	super.display();

	System.out.println("Salary is:"+salary);

	System.out.println("Designation is:"+designation);
}
	

}
