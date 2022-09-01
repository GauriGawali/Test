package classObjects;

import java.util.Scanner;

public class Fibbo {
	void star(int r)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	void fibb(int limit)
	{
		int a=0;
		int b=1;
		for(int i=2;i<=limit;i++)
		{
		int c=a+b;
		System.out.println(" "+c);
		a=b;
		b=c; 
		
		} 
	}
	void reverse(int num) {
       int sum=0;
	while(num!=0) {
		int r=num%10;
	    sum=sum*10+r;
	    num=num/10;
	    }
	System.out.println("Reverse no is"+sum);
	}
	public static void main(String[] args) {

		Fibbo f=new Fibbo();

		Scanner sc=new Scanner(System.in);
		System.out.println("1.fibbonicci");
		System.out.println("2.Reverse");
		System.out.println("3.Star Pattern");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:{
		System.out.println("Enter a limit");
		int limit=sc.nextInt();
		f.fibb(limit);
		break;
		}
		
		case 2:{
		System.out.println("Enter a no which has to be reverse");
        int num=sc.nextInt();
        f.reverse(num);
        break;
		}
		case 3:
		{
        System.out.println("Enter a row number");
        int r=sc.nextInt();
        f.star(r);
        break;
	}
		default:
			System.out.println("Enter Invalid input");
			}
	}
	}