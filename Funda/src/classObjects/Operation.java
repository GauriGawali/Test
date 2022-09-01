package classObjects;

public class Operation {
	void add(	int a,int b) {
	
		System.out.println("addition of no:"+(a+b));
	}
	void sub(int a,int b) {
		
		System.out.println("Subtration of no is:"+(a-b));
	}
	void multiplication(int a,int b) {
		
		System.out.println("Multiplication of both no is:"+(a*b));
	}
	void division(int a,int b) {
		
		System.out.println("Division of no is:"+(a/b));
	}
	void power(int pow,int base) { 
	for (int i = 1; i <= base; i++)  
	{
	     pow = pow * base;  
	   
	} System.out.print("Power of no is:"+pow);
	
	}
	public static void main(String[] args) {
		Operation op=new Operation();
		op.add(100, 200);
		op.sub(20, 10);
		op.division(50, 05);
		op.multiplication(10, 5);
		op.power(1, 4);
	}

}
