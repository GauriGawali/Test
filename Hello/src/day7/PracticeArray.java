package day7;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		
		int a[]=new int [5];
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}

	}
      */ //min number of array
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of array");
       int size=sc.nextInt();
	   int a[]=new int[size];
	  // System.out.println("length of array:"+a.length);
	   System.out.println("Enter Array elements");
	for(int i=0;i<=a.length-1;i++)
	{		
		a[i]=sc.nextInt();
     }
	int min=a[0];
	//System.out.println("Array elemnts are...");
	for(int i=0;i<=a.length-1;i++)
	{ 
		if(a[i]<min)
			min=a[i];
		//System.out.print(a[i] +" ");
	}
	System.out.println("Minimum value from array" +min);  
	/*
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter size of array ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter Array elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("odd elements in Array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(a[i] +" ");
		}
		
	} */}
}