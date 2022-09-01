package inheritanceConstructor;

public class GrandFather {
	String fn;
	String mm;
	static String ln="Gawali";
 public void setData(String fn,String mm,String ln) {
	 this.fn=fn;
	 this.mm=mm;
	 this.ln=ln;
 }
 void display() {
	 System.out.println(fn+" "+mm+" "+ln);
 }
}
