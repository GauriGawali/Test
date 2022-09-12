package ExamAssignment;

import java.util.Scanner;

//1.Write a program to calculate product of digits of any number
public class Q1 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner (System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int product = 1;
while(num!=0)
{
	int r=num%10;
	product=product*r;
	num=num/10;}
System.out.println(product);

	}
	
}
