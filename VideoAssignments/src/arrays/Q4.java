package arrays;

import java.util.Scanner;

/*
Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
 */
public class Q4 {
	void postiveNegative(int a[]) 
	{
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>0) 
		       System.out.println("Positive number of an array is:"+a[i]);
	    
		else if(a[i]<0)
			System.out.println("negative number in array is:"+a[i]);
		
		
		else
			System.out.println("zero num"+a[i]);
		}
	}
		void oddEven(int a[])
		{
			for(int i=0;i<a.length;i++) 
			{
		
		 if(a[i]%2!=0)
			System.out.println("Odd number in array is:"+a[i]);
		
		 if(a[i]%2==0) 
			System.out.println("even number in an array is:"+a[i]);
		
			
		}
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) 
		{
			//System.out.println("Enter a number");
			a[i]=sc.nextInt();
		}
		
		Q4 p=new Q4();
		p.postiveNegative(a);
		p.oddEven(a);
	}

}
