package Switcha;

import java.util.Scanner;

//11)Print 1 to 5 numbers using switch;
public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("1");
		case 2: System.out.println("2");
		case 3: System.out.println("3");
		case 4: System.out.println("4");
		case 5: System.out.println("5");
		break;
		default :
			System.out.println("Invalid input");
		}

	}


}
