package classObjects;

import java.util.Scanner;

public class Employee {
int id;long contact;
String name,dept;
float salary;
void setData(int i,String n,String d,long c,float s)
{
	id=i;
	name=n;
	dept=d;
	salary=s;
	contact=c;
	}
void display()
{
	System.out.println("Employee name is:"+name);
	System.out.println("Employee id is:"+id);
	System.out.println("Employee department is:"+dept);
	System.out.println("Employee salary is:"+salary);
	System.out.println("Employee contact no is:"+contact);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a id");
		int id=sc.nextInt();
		System.out.println("Enter a name");
		String name=sc.next();
		System.out.println("enter a deptartment");
		 String d=sc.next();
		System.out.println("Enter a salary");
		float salary=sc.nextInt();
		System.out.println("enter contact number");
		long c=sc.nextLong();
		Employee E1=new Employee();
		
		E1.setData(id, name, d, c, salary);
		//E1.display();//
		/**********************SECOND EMPLOYEE**********************************/
	
		System.out.println("enter a id");
		id=sc.nextInt();
		System.out.println("Enter a name");
		 name=sc.next();
		System.out.println("enter a deptartment");
		  d=sc.next();
		System.out.println("Enter a salary");
		salary=sc.nextInt();
		System.out.println("enter contact number");
		c=sc.nextLong();
		Employee E2=new Employee();
		
		E2.setData(id, name, d, c, salary);
	   // E2.display();//
	
	
		/**********************Third EMPLOYEE**********************************/
		
		System.out.println("enter a id");
		id=sc.nextInt();
		System.out.println("Enter a name");
		 name=sc.next();
		System.out.println("enter a deptartment");
		  d=sc.next();
		System.out.println("Enter a salary");
		salary=sc.nextInt();
		System.out.println("enter contact number");
		c=sc.nextLong();
		Employee E3=new Employee();
		
		E3.setData(id, name, d, c, salary);
		//E3.display();//
	
		
		
		/**********************Fourth EMPLOYEE**********************************/
		
		System.out.println("enter a id");
		id=sc.nextInt();
		System.out.println("Enter a name");
		 name=sc.next();
		System.out.println("enter a deptartment");
		  d=sc.next();
		System.out.println("Enter a salary");
		salary=sc.nextInt();
		System.out.println("enter contact number");
		c=sc.nextLong();
		Employee E4=new Employee();
		
		E4.setData(id, name, d, c, salary);
	//	E4.display();//
	
	
		/**********************FIFTH EMPLOYEE**********************************/
		
		System.out.println("enter a id");
		id=sc.nextInt();
		System.out.println("Enter a name");
		 name=sc.next();
		System.out.println("enter a deptartment");
		  d=sc.next();
		System.out.println("Enter a salary");
		salary=sc.nextInt();
		System.out.println("enter contact number");
		c=sc.nextLong();
		Employee E5=new Employee();
		
		E5.setData(id, name, d, c, salary);
		
		E1.display();
		E2.display();
		E3.display();
		E4.display();
		E5.display();
	
	
	
	
	
	}

}
