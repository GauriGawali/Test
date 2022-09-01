 package classObjects;

import java.util.Scanner;

public class Student {
int id,marks;
String name,dept;
void setData(int id,String name,String dept,int marks)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.marks=marks;
	}
 void display()
 {this.setData(id, name, dept, marks);
	System.out.println(id+" "+name+" "+dept+" "+marks); 
 }
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter a id");
int id=sc.nextInt();
System.out.println("Enter a name");
String name=sc.next();
System.out.println("enter a deptartment");
 String d=sc.next();
System.out.println("Enter a marks");
int marks=sc.nextInt();
Student s1=new Student();
s1.setData(id, name, d, marks);
s1.display();



System.out.println("enter a id");
id=sc.nextInt();
System.out.println("Enter a name");
 name=sc.next();
System.out.println("enter a deptartment");
  d=sc.next();
System.out.println("Enter a marks");
 marks=sc.nextInt();
Student s2=new Student();
s2.setData(id, name, d, marks); 
s2.display();

	}

}
