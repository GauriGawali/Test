package whileloop;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int no=sc.nextInt();
	int n=2;
	int mid=no/2;
	while(n<=mid)
	{
		if(no%n==0)
		{
			
			break;
		}
		n++;
	}
	if(n>mid)
	{
		System.out.println("no is prime number ");
	}
	else
	{
		System.out.println("No is not Prime ");
	}

	}

}
