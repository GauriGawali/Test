package day2;

import java.util.Scanner;

public class prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter phy marks");
int m1=sc.nextInt();
System.out.println("enter chemistry marks");
int m2=sc.nextInt();
System.out.println("enter maths marks");
int m3=sc.nextInt();
int total=m1+m2+m3;
float per=(100*total)/300;
System.out.println("Percentage in PCM group is:" +per+"%");
	
	if(per>=80.00f)
	
		System.out.println("Student pass with A+ grade");
		else if(per>=60)
			System.out.println("Student pass with A grade");
		else if(per>=50)
			System.out.println("Student pass with b grade");
		else if(per>=40)
			System.out.println("Student pass with c grade");
		else
			System.out.println("Student is fail!!!!");
			
	
		}

}
