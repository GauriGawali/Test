package day2;

import java.util.Scanner;

//Write a java program to find maximum number from given 3 numbers.
public class quen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a,b,c,largest,temp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter first no:");
a=sc.nextInt();
System.out.println("Enter second no:");
b=sc.nextInt();
System.out.println();
c=sc.nextInt();
temp=a>b?a:b;
largest=c>temp?c:temp;
System.out.println("the largest no is"+largest);*/
		
		
		
		
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,tem,large;
		System.out.println("Enter the First number");
		n1=sc.nextInt();
		System.out.println("Enter the second number");
		n2=sc.nextInt();
		System.out.println("Enter the third number");
		n3=sc.nextInt();
		tem=n1>n2?n1:n2;//comparing n1 and n2 and storing the largest number in a tem variable
		large=n3>tem?n3:tem;//comparing n3 with tem and storing a result in large
		System.out.println("The largest number is="  +large);
		

	}

}
