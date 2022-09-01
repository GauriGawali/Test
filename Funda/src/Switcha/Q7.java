package Switcha;

import java.util.Scanner;

//7. Write a Java program to enter number between 1to 5 and print it in word
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no between 1 to 5");
		int no=sc.nextInt();
		switch(no)
		{
		case 1:
		    System.out.println("ONE");
		    break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
