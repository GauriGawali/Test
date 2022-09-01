package Basic;

import java.util.Scanner;

/*Write a Java program to enter marks of five subjects and calculate total, average and percentage.

if percentege is greater than 85 he should get A+ grade
if percentege is greater than 75 and less than 85 he should get A grade
if percentege is greater than 65 and less than 75 he should get B grade
if percentege is greater than 55 and less than 65 he should get c grade
if percentege is greater than 45 and less than 55  he should get D grade
if percentege is greater than 35 and less than 45 he should get pass 
else
if percentege is less than 35 fail*/
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five subject marks");
		int math,sci,phy,chem,bio;
		math=sc.nextInt();
		sci=sc.nextInt();
		phy=sc.nextInt();
		chem=sc.nextInt();
		bio=sc.nextInt();
		float Total=math+sci+phy+chem+bio;
		float Avg=Total/5;
		float Per= (Total/500)*100;
     System.out.println("Avgerage marks"+Avg);
     System.out.println("Percentage of student"+Per);
if(Per>=85 && Per<=100)
{
	System.out.println("Student pass in A+ grade");
	}
else if(Per>=75 && Per<=84)
{
	System.out.println("Student pass in A grade");
	}
else if(Per>=65 && Per<=74)
{
	System.out.println("Student pass in B grade");
	}
else if(Per>=55 && Per<=64)
{
	System.out.println("Student pass in C grade"); 
	}
else if(Per>=45 && Per<=54)
{
	System.out.println("Student pass in D grade");
	}
else if(Per>=35 && Per<=44)
{
System.out.println("Student pass in Pass grade");	
}
else
	System.out.println("student is Fail");
	}

}
