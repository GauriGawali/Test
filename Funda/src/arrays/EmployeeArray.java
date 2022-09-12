package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//System.out.println("Enter the size");
int size=sc.nextInt();

Employee emp[]=new Employee[size];
 /*for(int i=0;i<size;i++) {
	System.out.println("Enter id,name,dept,salary");
	int id=sc.nextInt();
	String name=sc.next();
	String dept=sc.next();
	int salary=sc.nextInt();
	//emp[i]=new Employee(id,name,dept,salary);
}*/

Employee e=new Employee();
e.setId(45);
e.setName("Gauri");
e.setDept("Hr");
e.setSalary(580000);
Employee e1=new Employee();
e1.setId(415);
e1.setName("neha");
e1.setDept("Hr");
e1.setSalary(8960000);

System.out.println(Arrays.toString(emp));
for(Employee Ea:emp) {
	if(e.dept.equalsIgnoreCase("hr") &&(e.salary>56000))
 {
	System.out.println(e.name+" "+e.salary);
}
	if(e1.dept.equalsIgnoreCase("hr") &&(e1.salary>56000))
	 {
		System.out.println(e1.name+" "+e1.salary);
	}
}
	}
	}

	


