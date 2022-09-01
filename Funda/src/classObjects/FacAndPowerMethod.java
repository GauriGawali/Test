package classObjects;

import java.util.Scanner;

public class FacAndPowerMethod {
	void fact(int num) { 
		int fact=1;
		for(int i=1;i<=num;i++) 
		{
			fact=fact*i;
		}
		System.out.println("Factorial is:"+fact);
	
		}
	void power(int num,int power)
	{
		int product=1;
		for(int i=1;i<=power;i++)
		{
			product=product*num;
		}
		System.out.println(num+"^"+power+":"+product);
	}
	public static void main(String[] args) {
		FacAndPowerMethod fp=new FacAndPowerMethod ();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Factorial");
		System.out.println("2.Power");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
	case 1:
		System.out.println("enter a no");
		int n=sc.nextInt();
		fp.fact(n);
		break;
		
	case 2:
		System.out.println("enter a no to find a power");
		int num=sc.nextInt();
		System.out.println("enter a power");
		int p=sc.nextInt();
		fp.power(num, p);
		break;
		
	default:
			System.out.println("Enter a invalid input");
		
		}
	}

}
