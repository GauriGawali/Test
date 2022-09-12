package day2; 

import java.util.Scanner;

public class pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
System.out.println("Enter marks:");
int m=sc.nextInt();
if(m>=0 && m<=100)
{
if(m>=80 && m<=100)

	System.out.println("Student is pass with A+");
	
else if(m>=60 && m<=79)

	System.out.println("Student is pass with a grade");
else if(m>=50 && m<=59)
	System.out.println("Student is pass with b grade");
else if(m>=40 && m<=49)
	System.out.println("Student is pass with c grade");
else
	System.out.println("Student is fail");
	
	} 
else
	System.out.println("enter marks are invalid");
	}*/

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phy marks");
		int m1=sc.nextInt();
		System.out.println("Enter chemistry marks"); 
		int m2=sc.nextInt();
		System.out.println("Enter math marks");
		int m3=sc.nextInt();
		int total=m1+m2+m3;
		float per=(100*total)/3;
		
		if(per>=0 && per<=100)
		{
		if(per>=80 && per<=100)
		
			System.out.println("Student is pass with A+ grade");
		 else if(per>=60 && per<=79)
			 System.out.println("Studenis pass with B grade");
		 else if(per>=40 && per<59)
			System.out.println("student is pass with C grade");
		 else 
			 System.out.println("Student is fail");
		}
		
		
		
		else
			System.out.println("invalid marks");
}
	} 
