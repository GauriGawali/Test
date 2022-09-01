package Basic;

import java.util.Scanner;

//Write a Java program to check whether a number is even or odd
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		System.out.println("given number is Even");
		else
			System.out.println("Given no is Odd");

	}

}
