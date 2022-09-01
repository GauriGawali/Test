package inheritanceConstructor;

public class Fatherr extends GrandFather{
String fn;

void setData1(String fn){
	this.fn=fn;
	//super.mm=fn;
}
void display() {super.display();
	System.out.println(fn+" "+super.fn+" "+ln);
	//System.out.println(gf);

}
}
