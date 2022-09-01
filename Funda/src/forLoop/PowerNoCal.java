package forLoop;

import java.util.Scanner;

public class PowerNoCal {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int no=sc.nextInt();
	System.out.println("enter a power");
	int power=sc.nextInt();
	
	int product=1;
	for(int c=1;c<=power;c++)
	{
		product=product*no;
	}
	System.out.println(product);
	}

}
