package inheritance;

public class Car { int id;
String name,cnumber;
Driver d;
/*
Car(int id,String name,String cnumber,Driver d){
	this.id=id;
	this.name=name;
	this.cnumber=cnumber;
	this.d=d;
}
public String toString() {
	return id+"\n"+name+"\n"+cnumber+"\n"+d;
}*/

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getCnumber() {
	return cnumber;
}
public void setCnumber(String cnumber) {
	this.cnumber=cnumber;
}

public Driver getD() {
	return d;
}
public void setD(Driver d) {
	this.d=d;
}
}