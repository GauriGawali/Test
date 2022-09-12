package basic;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("enter a number");
			sum=sum+sc.nextInt();
		}
		System.out.println("sum is"+sum);

	}

}
