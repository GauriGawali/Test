package exception;

import java.util.Scanner;

public class exceptiontrycatchFinally {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s="hellos";
		char c[]=s.toCharArray();
		int c1=a+b;
		System.out.println(c1);
		try {
			System.out.println(c[5]);
			int c2=a/b;
			System.out.println(c2);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e1)
		{
			e1.printStackTrace();
			
		}
		finally {
			System.out.println("Finally block excecuted irespective of ANY EXCEPTION");
		}
	sc.close();
	System.out.println("Done");
	
	}

}
