package inheritanceConstructor;

public class C extends B {
 C(){
	 System.out.println("C Default Constructor");
 }
 
 C(int s){ super(20);
	 System.out.println("C Parameterised Constructor"+s);
 } 
}
