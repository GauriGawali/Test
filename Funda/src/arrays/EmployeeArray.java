package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();

Employee emp[]=new Employee[size];
for(int i=0;i<size;i++) {
	System.out.println("Enter id,name,dept,salary");
	int id=sc.nextInt();
	String name=sc.next();
	String dept=sc.next();
	int salary=sc.nextInt();
	emp[i]=new Employee(id,name,dept,salary);
}
System.out.println(Arrays.toString(emp));

for(Employee e:emp) {
//	if(e.dept.equalsIgnoreCase("hr")){
	if(e.salary>56000) {
	System.out.println(e.name+" "+e.salary);
}}

	}

}
