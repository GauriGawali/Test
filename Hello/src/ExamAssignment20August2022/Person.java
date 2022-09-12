package ExamAssignment20August2022;
/*
 3.	Create a class Person(id,name,contact,address,idproof[])
Create class IdProof (name,number,validity). Display all the persons name contact address who stay in pune and have adhaar card as idproof.

 */
public class Person extends IdProof {
int id;
String name,contact,address;
IdProof idf;
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
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public IdProof getIdf() {
	return idf;
}
public void setIdf(IdProof idf) {
	this.idf = idf;
}


void display()
{		if((address.equals("Pune")) && (iname.equals("Adhar Card"))) {
	
	}
}
}
