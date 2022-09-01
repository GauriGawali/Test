package inheritanceConstructor;

public class Department {
int id,noOfStudent;
String name,hod;
Student s;


public Department(int id, String name,String hod,int noOfStudent,Student s )
{
	this.id=id;
	this.name=name;
	this.hod=hod;
	this.noOfStudent=noOfStudent;
	this.s=s;
	
	}



public String toString() {
	return "Name of department is:="+name+"\nHod Name is:= "+hod+"\nNumber of Student is:= "+noOfStudent+"\n"+s;
}
}
