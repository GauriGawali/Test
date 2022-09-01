package Basic;

import java.util.Scanner;

//q6) Write a Java program to check whether a number is divisible by 5
public class DivBy5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num/5==0)
		{
			System.out.println("number is Divisible by 5");
		}
		else
			System.out.println("num is not Divisible by 5");
	}

}
