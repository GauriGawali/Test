package arrays;

public class Employee {
int id,salary;
String name,dept;

Employee(int id,String name,String dept,int salary){
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
}
public String toString()
{  
	return "\nid is:"+id+"\n name is"+name+"\n dept name is"+dept+"\n salaryis"+salary;
			}
}
