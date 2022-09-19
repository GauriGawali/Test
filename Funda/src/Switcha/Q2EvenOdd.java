package Switcha;
//Q2.Write a Java program to check whether a number is even or odd using switchcase. 

import java.util.Scanner;

public class Q2EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		System.out.println("enter choice");
		switch(no)
		{
		case 1: if(no%2==0)
			System.out.println("no is Even");
		else
			System.out.println("no is odd");
		break;
		//default :
			//System.out.println("Invalid input");
		}
		

	}

}
