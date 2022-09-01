package Basic;

import java.util.Scanner;

public class Num2SimpleCalu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1 and num2");
		//int num1=sc.nextInt();
		//int num2=sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("enter your choice");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println(num1+num2);
		break;
		case 2:
			 num1=sc.nextInt();
			 num2=sc.nextInt();
			System.out.println(num1-num2);
		break;
		case 3:
			 num1=sc.nextInt();
			 num2=sc.nextInt();
			System.out.println(num1*num2);
		break;
		case 4: num1=sc.nextInt();
		      num2=sc.nextInt(); 
			System.out.println("Dont enter num2 as zero");
			num2=sc.nextInt();
		    System.out.println("re enter num2");
			System.out.println(num1/num2);
		break;
		default :
		System.out.println("Invalid input");
		}

		
	}

}
