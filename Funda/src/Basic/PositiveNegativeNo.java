package Basic;
//Write a Java program to check whether a number is negative, positive or zero

import java.util.Scanner;

public class PositiveNegativeNo {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in); 
System.out.println("Enter a number");
int num=sc.nextInt();
if(num>0)
{System.out.println("given no is positive");
	}
else if(num==0)
{System.out.println("given no is zero");
	}
else
	System.out.println("Given no is negative");
	}

}
