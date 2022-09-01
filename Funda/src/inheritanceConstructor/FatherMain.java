package inheritanceConstructor;

public class FatherMain {

	public static void main(String[] args) {
		Father f=new Father();
		f.vehicle();
		f.house();
		
	 f=new Son();  //upcasting
	f.vehicle();
	f.house();

	
	f=new Daugther();
	f.vehicle();
	f.house();  
	}

}
