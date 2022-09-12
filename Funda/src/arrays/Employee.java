package arrays;

public class Employee {
int id,salary;
String name,dept;
/*
Employee(int id,String name,String dept,int salary){
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
}*/


public String toString()
{  
	return "\nid is:"+id+"\n name is"+name+"\n dept name is"+dept+"\n salaryis"+salary;
			}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDept() {
	return dept;
}


public void setDept(String dept) {
	this.dept = dept;
}
}
