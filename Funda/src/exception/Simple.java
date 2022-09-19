package exception;

import java.util.Scanner;

public class Simple {
	
static void mul(int a,int b) {
	int c=a*b;
	System.out.println("multiplication is:"+c);
}


static void division(int a,int b) {
	try {
	int c=a/b;
	System.out.println("Division is:"+c);
	}
	
	catch(Exception e) {
		
	}
}
static void add(int a,int b) {
	int c=a+b;
	System.out.println("Addition of num is:"+c);
}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Simple.mul(a, b);
       
        Simple.division(a, b);
        
        Simple.add(a, b);
		
	}

}
