package forLoop;

import java.util.Scanner;

public class DisplayNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int limit=sc.nextInt();
		int product=1;
		int product1=1;
		int i;
		
		for(i=1;i<=limit;i++)
		{ if(i%2==0)
			product=product*i;
		else 
			product1=product1*i;
		}
		System.out.println(product1+" Multiplication of Odd no");
		System.out.print(product+" Multiplication of even no" );
System.out.println(" Done ");
	}

}
