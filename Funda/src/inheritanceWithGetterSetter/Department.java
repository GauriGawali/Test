package inheritanceWithGetterSetter;

public class Department {
int id,NoStud;
String name,hod;
Student s;


public void setId(int id) {
	this.id=id;
}

public int getId() {
	return id;
}

public void setHod(String hod) {
	this.hod = hod;
}

public String getHod() {
	return hod;
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setNoStud(int NoStud) 
{
	this.NoStud=NoStud;
}
public int getNoStud()
{
	return NoStud;
}
public void setS(Student s) {
	this.s=s;
}
public Student getS() {
	return s;
}

}
