package Basic;

import java.util.Scanner;

//Write a Java program to find maximum between three numbers
public class MaxNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three num");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3)
				System.out.println("num1 is maximum no");
		else if(num2>num1 && num2>num3)
			System.out.println("num2 is maximum number");
		else
			System.out.println("num3 is maximum");
			

	}

}
