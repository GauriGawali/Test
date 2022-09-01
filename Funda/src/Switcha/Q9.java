package Switcha;

import java.util.Scanner;

/*9.WAP in java using switch case for following: Area of a circle Area of a square Area of a right angled triangle Area of a rectangle Circumference 
 * of a circle Perimeter of a square Accept inputs like radius,side,etc through keyboard.
//Menu driven program using switch case:
*/
public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice 1.area of circle,2.area of Square, 3.Area of Right angle Triangle, 4.Rectangle circumference");
		int ch=sc.nextInt();
		switch (ch)
		{
		case 1:
			System.out.println("Enter a readius and Pi value");
			float r=sc.nextInt();
			float pi=sc.nextFloat();
			 float Ac=pi*r*r;
			 System.out.println("Area of circle" +Ac);
			 break;
			 
		case 2:
			System.out.println("Enter a side value");
			int s=sc.nextInt();
			int As=s*s;
			System.out.println( " Area of Square"+As);
			break;
			
		case 3:
			System.out.println("Enter both side of triangle");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int Rt=(a*b)/2;
			System.out.println("Area of Right angled triangle:= " +Rt);
			break;
		case 4:
			System.out.println("Enter length and width");
			int l=sc.nextInt();
			int w=sc.hashCode();
			int c=2*(l*w);
			System.out.println("Rectangle Circumference:" +c);
			break;
			default :
				System.out.println("Invalid input");
		}

	}

}
