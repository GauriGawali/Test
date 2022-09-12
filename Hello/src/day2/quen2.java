package day2;

import java.util.Scanner;

//Write a java program to find sum of digits in any number. e.g. number is 435 sum is 12 
public class quen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		/*int num,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum of digit:"+sum);*/
		
		Scanner sc=new Scanner(System.in);
		int n1,digit,sum=0;
		System.out.println("Enter the number");
		n1=sc.nextInt();
		while(n1>0) {
			digit=n1%10;
			sum=sum+digit;
			n1=n1/10;
			//System.out.println("sum of digit="  + sum);
		}
		
		System.out.println("sum of digit="  + sum);
	}

}
