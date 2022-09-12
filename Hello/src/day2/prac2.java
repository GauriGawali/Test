package day2;

import java.util.Scanner;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter person age:");
int p=sc.nextInt();
if(p>=18)
	System.out.println("Person is allowed to open bank account");
else
	System.out.println("Person not allowed to open bank account");
	}

}
