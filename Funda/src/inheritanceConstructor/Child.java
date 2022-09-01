package inheritanceConstructor;

public class Child extends Fatherr{
String fn;
Fatherr f;
void setData2(String fn) {
	this.fn=fn;
	//super.mm=fn;
	
}
void display() {
	super.display();
	System.out.println(fn+" "+super.fn+" "+ln);
	
}
}
