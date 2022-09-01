package inheritanceConstructor;

public class B extends A{
B(){
	System.out.println("B Default constructor");
}

B(int m){
	System.out.println("B Paramerised Constructor"+m);
}

public Daugther display() {
	System.out.println("display");
	return new Daugther();
}
	

}